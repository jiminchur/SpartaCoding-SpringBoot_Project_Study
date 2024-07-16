package com.example.spartacoding;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}

/**
 * Main
 * 
 */
class Main { 
    public static void main(String[] args){
        Memo memo = new Memo("민철");
        System.out.println(memo.getUsername());
    }

}