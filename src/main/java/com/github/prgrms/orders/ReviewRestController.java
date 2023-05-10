package com.github.prgrms.orders;

import javax.validation.Valid;

import com.github.prgrms.errors.UnauthorizedException;
import com.github.prgrms.security.JwtAuthenticationToken;
import com.github.prgrms.users.LoginRequest;
import com.github.prgrms.users.User;
import com.github.prgrms.utils.ApiUtils.ApiResult;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class ReviewRestController {
    // TODO review 메소드 구현이 필요합니다.

    @PostMapping(path = "review")
    public ApiResult<ReviewDto> review(
            @Valid @RequestBody LoginRequest request
    ) throws UnauthorizedException {
    }

}