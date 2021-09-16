package ru.netology.domain;

public class Post {
    private int id;

    private int countLike;
    private LikesInfo likesInfo; //поле из документации

    private int countComment;
    private String commentsInfo1;
    private String sendComment;
    private CommentsInfo commentsInfo; //поле из документации

    private int countSend;
    private RepostsInfo repostsInfo; //поле из документации

    private int countPostSeen;
    private ViewsInfo viewsInfo; //поле из документации

    private boolean interestingPost; // сначала интересные записи, нет в документации

    private boolean fixedPost;
    private int isPinned; //поле из документации

    private String fotoWhoPost; //нет в документации
    private String nameWhoPost; //нет в документации

    private String dataPost;
    private int date; //поле из документации

    private String contain;
    private String text; //поле из документации

    private boolean more; // нет в документации, имелла ввиду троеточие в правом верхнем углу у записи


    // далее все поля из документации, которых у меня не было
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signerId;
    private int replyOwnerId;
    private int replyPostId;
    private int freindsOnly;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int markerAsAds;
    private boolean isFavorite;
    private int postponedId;

}
