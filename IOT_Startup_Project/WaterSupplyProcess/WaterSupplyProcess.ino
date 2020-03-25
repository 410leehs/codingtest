void setup() {
  // put your setup code here, to run once:
  pinMode(A0,INPUT);
  pinMode(2,OUTPUT);pinMode(3,OUTPUT);pinMode(4,OUTPUT);
  pinMode(5,OUTPUT);pinMode(6,OUTPUT);pinMode(7,OUTPUT);
  pinMode(8,OUTPUT);pinMode(9,OUTPUT);pinMode(10,OUTPUT);
  pinMode(11,OUTPUT);pinMode(12,OUTPUT);pinMode(13,OUTPUT);
  digitalWrite(2,HIGH);digitalWrite(3,HIGH);digitalWrite(4,HIGH);
  digitalWrite(5,HIGH);digitalWrite(6,HIGH);digitalWrite(7,HIGH);
  digitalWrite(8,HIGH);digitalWrite(9,HIGH);digitalWrite(10,HIGH);
  digitalWrite(11,HIGH);digitalWrite(12,HIGH);digitalWrite(13,HIGH);

  Serial.begin(9600)
}

void loop() {
  Serial.println(analogRead(A0));
  if(analogRead(A0)==0){
    //배양액 A공급(상추, 깻잎)
    digitalWrite(9,LOW);digitalWrite(4,LOW);digitalWrite(2,LOW);
    delay(3000);
    //배양약 B공급(토마토, 고추, 오이)
    digitalWrite(9,HIGH);
    digitalWrite(8,LOW);
    delay(3000);
    //물공급
    digitalWrite(8,HIGH);
    digitalWrite(6,LOW);
    delay(60000);
    //희석
    digitalWrite(6,HIGH);
    digitalWrite(7,LOW);
    delay(5000);
    //배양기 1공급
    digitalWrite(4,HIGH);digitalWrite(6,HIGH);
    digitalWrite(12,LOW);
    delay(70000);
    //배양기 1 배수프로세스
    digitalWrite(12,HIGH);digitalWrite(7,HIGH);
    digitalWrite(3,LOW);digitalWrite(5,LOW);
    delay(120000);
    //프로세스 종료
    digitalWrite(2,HIGH);digitalWrite(3,HIGH);digitalWrite(5,HIGH);
  }
}
  }

}
