package application;

import entities.Post;
import entities.PostComments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PostProgram {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelândia",
                "Vim visitar este país maravilhoso",
                12
        );

        PostComments c1 = new PostComments(
                "Tenha uma boa viagem!"
        );
        PostComments c2 = new PostComments(
                "Este pais e maravilhoso!"
        );

        post.addComments(c1);
        post.addComments(c2);

        System.out.println(post);

        sc.close();
    }

}
