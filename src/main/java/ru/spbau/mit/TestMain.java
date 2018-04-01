package ru.spbau.mit;

import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.spbau.mit.my_lexer.*;
import java.util.Scanner;
import java.io.*;

import java.io.FileNotFoundException;

public class TestMain {
    public static void main(String[] args) {

    System.out.println("here");
        try {
            my_lexer lexer = new my_lexer(CharStreams.fromFileName(args[0]));
            System.out.println("(RULES_NAME, line_number, start_position, end_position, value)");
            while (true) {
                Token token = lexer.nextToken();
                if (token.getType() == -1) break;
                if (token.getType() == lexer.WS) continue;
                System.out.println("("
                        + lexer.getRuleNames()[token.getType() - 1]
                        + ", " + String.valueOf(token.getLine() - 1)
                        + ", " + String.valueOf(token.getStartIndex())
                        + ", " + String.valueOf(token.getStopIndex())
                        + ", " + String.valueOf(token.getText())
                        + ")");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
