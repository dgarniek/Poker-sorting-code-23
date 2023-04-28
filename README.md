# Poker-sorting-code-23
The code here represents the code I used for my card sorting project. It contains three main domains, the code the arduino excecutes (java), the code the raspberry pi
excecutes (python), and the code where the pi communicates with the arduino through serial communication (python on pi and java on arduino). 
The arduino code simply controls the motors based on information given by the pi. The pi uses a camera to capture an image of the card and run a color sorting 
algorithim which can identify the color of the card. The pi then sends this information to the arduino and the arduino excecutes the pi's command.
