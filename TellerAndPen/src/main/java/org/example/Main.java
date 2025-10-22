package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        String apiKey = System.getenv("OPENAI_API_KEY");
        System.out.println(apiKey);
        System.out.println(System.getenv("OPENAI_API_KEY"));
    }
}