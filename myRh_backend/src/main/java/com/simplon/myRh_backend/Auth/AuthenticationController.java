package com.simplon.myRh_backend.Auth;

import com.simplon.myRh_backend.agent.Agent;
import com.simplon.myRh_backend.company.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody Company registerRequest){
        //TODO: register user
        return ResponseEntity.ok(authenticationService.register(registerRequest));

    }

    @PostMapping("/register/agent")
    public ResponseEntity<AuthenticationResponse> registerAgent(@RequestBody Agent registerRequest){
        return ResponseEntity.ok(authenticationService.registerAgent(registerRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest authRequest){
        return ResponseEntity.ok(authenticationService.authenticate(authRequest));
    }

}
