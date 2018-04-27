public class Data {
	private Object data [][]; // transactions
	private int numberOfExamples; // number of transactions
	private Attribute attributeSet[];
	
	Data() {
        data = new Object [14][5];
        numberOfExamples = 14;		 
        attributeSet = new Attribute[5]; 
        
        /* Populate attributeSet */
		String outLookValues[] = new String[3];
		outLookValues[0] = "overcast";
		outLookValues[1] = "rain";
		outLookValues[2] = "sunny";
		attributeSet[0] = new DiscreteAttribute("Outlook", outLookValues);
		
		String temperatureValues[] = new String[3];
		temperatureValues[0] = "cold";
		temperatureValues[1] = "mild";
		temperatureValues[2] = "hot";
		attributeSet[1] = new DiscreteAttribute("Temperature", temperatureValues);
		
		String humidityValues[] = new String[2];
		humidityValues[0] = "normal";
		humidityValues[1] = "high";
		attributeSet[2] = new DiscreteAttribute("Humidity", humidityValues);
		
		String windValues[] = new String[2];
		windValues[0] = "weak";
		windValues[1] = "strong";
		attributeSet[3] = new DiscreteAttribute("Wind", windValues);
		
		String playTennisValues[] = new String[2];
		playTennisValues[0] = "yes";
		playTennisValues[1] = "no";
		attributeSet[4] = new DiscreteAttribute("Play Tennis", playTennisValues);
		
        /* Populate data */
		data[0][0] = ((DiscreteAttribute) attributeSet[0]).getValue(2); // casting to DiscreteAttribute
		data[0][1] = ((DiscreteAttribute) attributeSet[1]).getValue(2);
		data[0][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[0][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[0][4] = ((DiscreteAttribute) attributeSet[4]).getValue(1);
		
		data[1][0] = ((DiscreteAttribute) attributeSet[0]).getValue(2);
		data[1][1] = ((DiscreteAttribute) attributeSet[1]).getValue(2);
		data[1][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[1][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[1][4] = ((DiscreteAttribute) attributeSet[4]).getValue(1);

		data[2][0] = ((DiscreteAttribute) attributeSet[0]).getValue(0);
		data[2][1] = ((DiscreteAttribute) attributeSet[1]).getValue(2);
		data[2][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[2][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[2][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);

		data[3][0] = ((DiscreteAttribute) attributeSet[0]).getValue(1);
		data[3][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[3][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[3][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[3][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[4][0] = ((DiscreteAttribute) attributeSet[0]).getValue(1);
		data[4][1] = ((DiscreteAttribute) attributeSet[1]).getValue(0);
		data[4][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[4][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[4][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[5][0] = ((DiscreteAttribute) attributeSet[0]).getValue(1);
		data[5][1] = ((DiscreteAttribute) attributeSet[1]).getValue(0);
		data[5][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[5][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[5][4] = ((DiscreteAttribute) attributeSet[4]).getValue(1);
		
		data[6][0] = ((DiscreteAttribute) attributeSet[0]).getValue(0);
		data[6][1] = ((DiscreteAttribute) attributeSet[1]).getValue(0);
		data[6][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[6][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[6][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[7][0] = ((DiscreteAttribute) attributeSet[0]).getValue(2);
		data[7][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[7][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[7][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[7][4] = ((DiscreteAttribute) attributeSet[4]).getValue(1);
		
		data[8][0] = ((DiscreteAttribute) attributeSet[0]).getValue(2);
		data[8][1] = ((DiscreteAttribute) attributeSet[1]).getValue(0);
		data[8][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[8][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[8][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[9][0] = ((DiscreteAttribute) attributeSet[0]).getValue(1);
		data[9][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[9][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[9][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[9][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[10][0] = ((DiscreteAttribute) attributeSet[0]).getValue(2);
		data[10][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[10][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[10][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[10][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[11][0] = ((DiscreteAttribute) attributeSet[0]).getValue(0);
		data[11][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[11][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[11][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[11][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[12][0] = ((DiscreteAttribute) attributeSet[0]).getValue(0);
		data[12][1] = ((DiscreteAttribute) attributeSet[1]).getValue(2);
		data[12][2] = ((DiscreteAttribute) attributeSet[2]).getValue(0);
		data[12][3] = ((DiscreteAttribute) attributeSet[3]).getValue(0);
		data[12][4] = ((DiscreteAttribute) attributeSet[4]).getValue(0);
		
		data[13][0] = ((DiscreteAttribute) attributeSet[0]).getValue(1);
		data[13][1] = ((DiscreteAttribute) attributeSet[1]).getValue(1);
		data[13][2] = ((DiscreteAttribute) attributeSet[2]).getValue(1);
		data[13][3] = ((DiscreteAttribute) attributeSet[3]).getValue(1);
		data[13][4] = ((DiscreteAttribute) attributeSet[4]).getValue(1);
		
	}
	
	int getNumberOfExamples() {
		return numberOfExamples;
	}
	
	int getNumberOfAttributes() {
		return attributeSet.length;
	}
	
	Object getAttributeValue(int exampleIndex, int attributeIndex) {
		return data[exampleIndex][attributeIndex];
	}
	
	Attribute getAttribute(int index) {
		return attributeSet[index];
	}
	
	public String toString() {
		String str = new String();
		// print attributes
		for(int i = 0; i < 5; i++) {
			str = str + attributeSet[i].toString() + "  ";
		}
		// print data
		str = str + "\n";
		for(int i = 0; i < numberOfExamples; i++) {
			str = str + (i + 1) + ") ";
			for(int j = 0; j < 5; j++) {
				str = str + data[i][j] + "   ";
			}
			str = str + "\n";
		}
		
		return str;
	}
	
	public static void main(String args[]){
		Data trainingSet = new Data();
		System.out.println(trainingSet);
	}
}