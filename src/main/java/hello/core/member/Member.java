package hello.core.member;

public class Member {
    private Long id;
    private String name;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    private Grade grade;


}
