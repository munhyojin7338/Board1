package com.example.board1.user.controller;


import com.example.board1.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiUserController {

    private final UserRepository userRepository;

//    public void addUser (@RequestBody @Valid UserInput userInput, Errors errors) {
//
////        List<ResponseError> responseErrorList = new ArrayList<>();
////        if (errors.hasErrors()) {
////            errors.getAllErrors().forEach((e) ->  {
//////                responseErrorList.add(ResponseError.of(FieldError)e));
////            });
////        }
//

    @PostMapping("/api/user/login")
    public void createToken() {

    }


}
