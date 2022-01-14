package com.security.lab7.user.UserDto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserDto {
	private UUID id;
	private String username;
	private String phone;
}
