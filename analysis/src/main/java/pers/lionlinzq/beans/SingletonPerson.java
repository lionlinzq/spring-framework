package pers.lionlinzq.beans;

import java.time.LocalDateTime;

/**
 * 人
 *
 * @author lin
 * @date 2024/03/18
 */
public class SingletonPerson {

	/**
	 * ID
	 */
	private Long id;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 电子邮件
	 */
	private String email;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
