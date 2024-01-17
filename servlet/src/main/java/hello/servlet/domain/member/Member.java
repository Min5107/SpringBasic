package hello.servlet.domain.member;

import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Member {
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private int age;


}
