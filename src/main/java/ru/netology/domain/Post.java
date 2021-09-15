package ru.netology.domain;

public class Post {
    private int id;
    private int countLike;
    private int countComment;
    private String commentsInfo;
    private String sendComment;
    private int countSend;
    private int countPostSeen;

    private boolean interestingPost; // сначала интересные записи
    private boolean fixedPost;

    private String fotoWhoPost;
    private String nameWhoPost;
    private String dataPost;

    private String contain;
    private boolean more;

}
