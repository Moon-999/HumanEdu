package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ContentDto.class.isAssignableFrom(clazz);
		//return 커맨드객체.class.isAssignableFrom(clazz);
		//여기는 외워서 그냥 작성하는 것으로 생각해야함
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		ContentDto dto = (ContentDto)target;
		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "trouble");
		                 //ContentDto객체의 필드명
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"writer",
				"writer is empty.");
		String sWriter = dto.getWriter();
		if (sWriter.length() < 3) {
			errors.rejectValue("writer", "writer is too short");
		}
		
//		String sContent = dto.getContent();
//		if(sContent == null || sContent.trim().isEmpty()) {
//			System.out.println("Content is null or empty");
//			errors.rejectValue("content", "trouble");
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content",
				"content is empty");

	}

}
