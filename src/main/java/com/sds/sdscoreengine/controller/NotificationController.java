package com.sds.sdscoreengine.controller;

import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/productNotification")
@Slf4j
public class NotificationController {
    @Autowired
   public  Environment env;

    @GetMapping("/data")
    public ResponseEntity<String> getEnvValue(){
        return  new ResponseEntity<String>(env.getProperty("TWILIO_ACCOUNT_SID").toString(),HttpStatus.OK);
    }
      @GetMapping("/pVerification")
    public ResponseEntity<String> generateOTP(){
        Twilio.init(env.getProperty("TWILIO_ACCOUNT_SID"),env.getProperty("TWILIO_AUTH_TOKEN"));
        Verification verification=Verification.creator(
                "VA28d22fe1c8481083ad493f21431f39dd",  // this is your verification sid
                "+91-9040991055",    //this is your Twilio verified recipient phone number
                "sms").create();   // this is your channel type

        System.out.println("Verfication status::"+verification.getStatus());

       // log.info("OTP has been successfully generated, and awaits your verification {}", LocalDateTime.now());
        return new ResponseEntity<String>("Your OTP has been sent to your verified phone number", HttpStatus.OK);
    }
    @GetMapping("/verifyOTP")
    public ResponseEntity<?> verifyUserOTP() throws Exception {
        Twilio.init(env.getProperty("TWILIO_ACCOUNT_SID"),env.getProperty("TWILIO_AUTH_TOKEN"));

        try {

            VerificationCheck verificationCheck = VerificationCheck.creator(
                            "VA28d22fe1c8481083ad493f21431f39dd")
                    .setTo("+91-9040991055")
                    .setCode("808506")
                    .create();

            System.out.println(verificationCheck.getStatus());

        } catch (Exception e) {
            return new ResponseEntity<>("Verification failed.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("This user's verification has been completed successfully", HttpStatus.OK);
    }
}

