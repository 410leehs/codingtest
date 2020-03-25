int cdsPin = A0;   //조도센서 핀번호 설정
int outputpin = A5;//온습도센서 핀번호 설정
int LED =1;//LED라는 변수에 1저장
int cdsVal;
int tem;
int hum;
void setup()
{
    Serial.begin(9600);
    Serial.println("CLEARDATA");//엑셀의 모든내용 삭제 및 초기화
    Serial.println("LABEL,Time,illumination"); //라벨 작성
    Serial.println("CUSTOMBOX1,LABEL,Stop logging at 250?");
    Serial.println("CUSTOMBOX2,LABEL,Resume log at 350?");
    Serial.println("CUSTOMBOX3,LABEL,Quit at 450?");

    Serial.println("CUSTOMBOX1,SET,1");
    Serial.println("CUSTOMBOX2,SET,1");
    Serial.println("CUSTOMBOX3,SET,0");
}
void loop()
{
    //온도 측정
   Serial.print("Date,Time,Counter");//현재 날짜,시간,횟수를 출력
   cdsVal = analogRead(A0);         //조도값 측정
   Serial.println(cdsVal);          //조도값 출력
   tem=analogRead(A5);              //온도값 측정
   Serial.println(tem);             //온도값 출력
   hum=analogRead(A5);              //습도값 측정
   Serial.println(hum);             //습도값 출력
}
