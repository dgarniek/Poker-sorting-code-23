
int LED1 =2;
int LED2 =3;
void setup() {
  Serial.begin(9600);
  pinMode(LED1, OUTPUT);
  pinMode(LED2, OUTPUT);
}

void loop() {
  
  
  if(Serial.available() > 0){
    String message = Serial.readStringUntil('\n');
    if (message.equals("r")){
      digitalWrite(LED1, HIGH);
      digitalWrite(LED2, LOW);

    }
    if(message.equals("b")){
      digitalWrite(LED2, HIGH);
      digitalWrite(LED1, LOW);
    }
    
    }
    

}
