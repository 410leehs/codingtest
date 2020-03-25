/*
 * Demo sketch for new "PLX DAQ v2"
 * including most all common commands to be used
 */

int i = 0;

void setup() {

  // open serial connection
    Serial.begin(9600);

    Serial.println("CLEARSHEET"); // 엑셀의 모든내용 삭제 및 초기화
    
  // "Date", "Time", "Timer", "Counter" and "millis"이라는 이름의 열 정의
    Serial.println("LABEL,Date,Time,Timer,Counter,millis");


    Serial.println("CUSTOMBOX1,LABEL,Stop logging at 250?");
    Serial.println("CUSTOMBOX2,LABEL,Resume log at 350?");
    Serial.println("CUSTOMBOX3,LABEL,Quit at 450?");


    Serial.println("CUSTOMBOX1,SET,1");
    Serial.println("CUSTOMBOX2,SET,1");
    Serial.println("CUSTOMBOX3,SET,0");
}

void loop() {

   
      Serial.println( (String) "DATA,DATE,TIME,TIMER," + i++ + "," + millis() + ",AUTOSCROLL_20" );



      if(i==100)
        Serial.println("ClearRange,B,10,D,20");


      if(i==150)
        Serial.println("BEEP");

  
      if(i==200)
      {
        Serial.println("CELL,GET,FROMSHEET,Simple Data,E,4"); // ==> request value from sheet
          // Serial.println("CELL,GET,E4"); ==> short version to read from active sheet in Excel
        int readvalue = Serial.readStringUntil(10).toInt(); // get response. Note: the '10' is important! Always use but never change ;-)
        Serial.println( (String) "Value of cell E4 is: " + readvalue); // result displayed in Excel DirectDebugWindow to double check
      }



      if(i==250)
      {
        Serial.println("CUSTOMBOX1,GET");
        int stoplogging = Serial.readStringUntil(10).toInt();
        // this information can be seen in the direct debug window on PLX DAQ in Excel
        Serial.println( (String) "Value of stoplogging/checkbox is: " + stoplogging);
        if(stoplogging) 
          Serial.println("PAUSELOGGING");
      }

      if(i==300)
      {
        Serial.println("GETRANDOM,-4321,12345"); // between -4321 to 12345
        int rndseed = Serial.readStringUntil(10).toInt();
        Serial.println( (String) "Got random value '" + rndseed + "' from Excel" );
        // Note: this information is not posted to the Excel sheet because "DATA" is missing
        // instead this information can be seen in the direct debug window
      }


      if(i==350)
      {
        Serial.println("CUSTOMBOX2,GET");
        int resumelogging = Serial.readStringUntil(10).toInt();
        if(resumelogging) 
          Serial.println("RESUMELOGGING");
      }   

      if(i==400)
      {
        Serial.println("CELL,SET,G10,400 test 1 string"); // default sheet active in PLX DAQ Excel
        Serial.println("CELL,SET,ONSHEET,Simple Data,G,11,400 test 2 string"); // named sheet available in PLX DAQ Excel
      }

      if(i==450)
      {
        Serial.println("CUSTOMBOX3,GET");
        if(Serial.readStringUntil(10).toInt()) {
          Serial.println("SAVEWORKBOOKAS,450-Lines-File");
          Serial.println("FORCEEXCELQUIT");
        }
        else
          Serial.println("No forced Excel quit requested!");
      }
}
