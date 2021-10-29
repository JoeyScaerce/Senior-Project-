import smtplib
from email.message import EmailMessage
from time import sleep
import psutil
import os
#from picamera import PiCamera
 
def email_alert(subject, body, to):
    
    msg = EmailMessage()
    msg.set_content(body)
    msg['subject'] = subject
    msg['to'] = to
 
    user = "scaercejoey@gmail.com"
    msg['from'] = user
    password = "uvhhkgeqbwputbih"
 
    server = smtplib.SMTP("smtp.gmail.com", 587)
    server.starttls()
    server.login(user, password)
 
    server.send_message(msg)
 
    server.quit()



 
if __name__ == '__main__':

    try:
      memory = psutil.virtual_memory();
      total = round(memory.total);

      i = 0;
      while i < 7:
        camera = PiCamera()
        startRecording = 5
        endRecording = 10

        a = "space"+i


        sleep(startRecording)
        camera.start_preview()
        camera.start_recording('/home/pi/Desktop/SPACE' + a)
        sleep(endRecording)
        camera.stop_recording()

        file_size = os.path.getsize(a)
        camera.stop_preview()
        i += 1
    except BaseException:
      i = 0
      while i < 100:
        print("an error has occured in the camera")
        email_alert("Spamton", "Now is your chance to be a [Big Shot]", "3024375427@vtext.com")
        print("msg has been sent")
        i += 1

