package mining;
import java.io.*;
import data.Data;
import data.OutOfRangeSampleSize;

public class KmeansMiner {
    private ClusterSet C;
    
    public KmeansMiner(int k) {
        C = new ClusterSet(k);
    }
    
    public KmeansMiner(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        C = (ClusterSet)in.readObject();
        in.close();
    }
    public void save(String filename) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(C);
        out.close();
    }
    
    public ClusterSet getC() {
        return C;
    }

    public int kmeans(Data data) throws OutOfRangeSampleSize {
        int numberOfIterations = 0;
        // first step
        C.initializeCentroids(data);
        boolean changedCluster;
        do {
            numberOfIterations++;
            // second step
            changedCluster = false;
            for(int i = 0; i < data.getNumberOfExamples(); i++) {
                Cluster nearestCluster = C.nearestCluster(data.getItemSet(i));
                Cluster oldCluster = C.currentCluster(i);
                boolean currentChange = nearestCluster.addData(i);
                if(currentChange) {
                    changedCluster = true;
                }
                // remove the tuple from the old cluster
                if(currentChange && oldCluster != null) {
                    oldCluster.removeTuple(i);            
                }
            }           
            // third step
            C.updateCentroids(data);
        } while(changedCluster);
        return numberOfIterations;
    }
    
    public String toString() {
        return C.toString();
    }
}

