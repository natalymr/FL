package ru.spbau.mit;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import ru.spbau.mit.my_lexer.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import static junit.framework.TestCase.*;

public class LexerTest {


    @Test
    public void example() {
        my_lexer lexer = new my_lexer(CharStreams.fromString(
                "read x; if y + 1 == x then write y else write x"));
        String[] expected = {"READ", "ID", "SCOLON", "IF", "ID", "PLUS", "INT",
                "EQ", "ID", "THEN", "WRITE", "ID", "ELSE", "WRITE", "ID"};
        String[] result = new String[15];
        int counter = 0;
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == -1) break;
            if(token.getType() == lexer.WS) continue;

            result[counter] = lexer.getRuleNames()[token.getType() - 1];
            counter++;
        }
        assertEquals(true, Arrays.equals(expected, result));
    }


    @Test
    public void simpleTest() {
        my_lexer lexer = new my_lexer(CharStreams.fromString("1 + 3"));
        String[] expected = {"INT", "PLUS", "INT"};
        String[] result = new String[3];
        int counter = 0;
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == -1) break;
            if(token.getType() == lexer.WS) continue;

            result[counter] = lexer.getRuleNames()[token.getType() - 1];
            counter++;
        }
        assertEquals(true, Arrays.equals(expected, result));
    }


    @Test
    public void arithmeticTest() {
        my_lexer lexer = new my_lexer(CharStreams.fromString("-1 + 3 / 2.3 * 2e+2"));
        String[] expected = {"INT", "PLUS", "INT", "DIV", "FLOAT", "MULT", "FLOAT"};
        String[] result = new String[7];
        int counter = 0;
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == -1) break;
            if(token.getType() == lexer.WS) continue;

            result[counter] = lexer.getRuleNames()[token.getType() - 1];
            counter++;
        }
        assertEquals(true, Arrays.equals(expected, result));
    }


    @Test
    public void tokenSeperator() {
        my_lexer lexer = new my_lexer(CharStreams.fromString("123sdasd+-!===||&&/"));
        String[] expected = {"INT", "ID", "PLUS", "MINUS", "NE", "EQ", "OR", "AND", "DIV"};
        String[] result = new String[9];
        int counter = 0;
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == -1) break;
            if(token.getType() == lexer.WS) continue;

            result[counter] = lexer.getRuleNames()[token.getType() - 1];
            counter++;
        }
        assertEquals(true, Arrays.equals(expected, result));
    }


    @Test
    public void whileTrue() {
        my_lexer lexer = new my_lexer(CharStreams.fromString("while true || false"));
        String[] expected = {"WHILE", "BOOL", "OR", "BOOL"};
        String[] result = new String[4];
        int counter = 0;
        while(true) {
            Token token = lexer.nextToken();
            if(token.getType() == -1) break;
            if(token.getType() == lexer.WS) continue;

            result[counter] = lexer.getRuleNames()[token.getType() - 1];
            counter++;
        }
        assertEquals(true, Arrays.equals(expected, result));
    }
}
