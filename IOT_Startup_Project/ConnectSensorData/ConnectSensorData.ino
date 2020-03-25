/*
 * demo sketch for PLX DAQ v2 
 * Moving Real Time Data Diagramm
 */

void setup() {

    Serial.begin(9600);

    Serial.println("CLEARDATA");
    Serial.println("LABEL,Date,Time,Millis,RandonValue");

  
    Serial.println("GETRANDOM,0,32323");
    int rndseed = Serial.readStringUntil(10).toInt();
    Serial.println( (String) "Got random value '" + rndseed + "' from Excel" );
    randomSeed(rndseed);
}

void loop() {

  Serial.println( (String) "DATA,DATE,TIME," + millis() + "," + random(0, 500) );
  
  delay(50);      
}
