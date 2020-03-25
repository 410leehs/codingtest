int outputpin=A5;//센서와 연결된 아날로그 핀 설정
void setup() {
  Serial.begin(9600);            // 시리얼 통신을 열고 속도를 9600bps 로 사용한다.
  int tem= analogRead(outputpin);// 온도센서로부터 자료값을 받는다.
  int hum= analogRead(outputpin);// 습도센서로부터 자료값을 받는다.
  float tem = (voltage - 0.5) * 100 ; //전기신호 숫자 변환
  Serial.print("Temperature:");
  Serial.print(tem);
  Serial.print("C ");
  Serial.print("humidity:");
  Serial.print(hum);
  Serial.print("%");              // 수정하여 나온 자료값을 출력한다.
  delay(1000);//1초간의 지연시간
}
int LED = 1// LED라는 변수에 1 저장
void setup(){
  pinMode(LED, OUTPUT)//LED, 1번 출력으로 설정
}
void loop() {
  if (tem > 4)               //만약 온도가 4C이상으로 올라가면
  digitalWrite(LED, LOW);    //LED출력 감소
  else if(tem<0)             //만약 온도가 0C이하로 내려가면
  digitalWrite(LED, HIGH);   //LED출력 증가
  else
  digitalWrite(LED,HIGH);
  delay(500);
  digitalWrite(LED,LOW);
  delay(500);                //온도가 0에서 4도 사이이면 반복적으로 켜졌다 꺼짐

}
