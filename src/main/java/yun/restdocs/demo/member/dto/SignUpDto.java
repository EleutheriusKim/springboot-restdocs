package yun.restdocs.demo.member.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import yun.restdocs.demo.member.Member;
import yun.restdocs.demo.model.Address;
import yun.restdocs.demo.model.Email;

import javax.validation.Valid;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class SignUpDto {

    @Valid
    private Email email;

    @Valid
    private Address address;

    public Member toEntity() {

        return Member.builder()
                .email(email)
                .address(address)
                .build();

    }
}
