package com.codestates.script;

public class part3 {
  /*
  ----------------------------------------------------------------------------------------------
      TODO: 유어클래스의 requirement를 참조하여, migration/schema.sql에 추가로 구성해주세요.
  */

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-1. category 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 category 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_1 = "DESC category;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-2. content_category 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 content_category 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_2 = "DESC learnSQL.content_category;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-3. role 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 role 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_3 = "DESC role;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-4. user 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 user 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_4 = "DESC user;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-1. category 테이블에 존재하는 데이터에서 id, name을 찾는 SQL을 작성해주세요.
  */

  public static final String PART3_2_1 = "select id, name from category;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-2. user의 name과 email 그리고 그 user가 속한 role name(컬럼명: roleName)을 찾기 위한 SQL을 작성해주세요.
          - 속한 role이 없더라도, user의 name과 email,role name을 모두 찾아야합니다.
  */
  public static final String PART3_2_2 = "select u.name, u.email, r.name from user u left join role r on u.roleId = r.id;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-3. 어느 role에도 속하지 않는 user의 모든 컬럼 데이터를 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_3 = "select * from user where roleid is null";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-4. content_category 테이블에 존재하는 모든 칼럼의 데이터를 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_4 = "select * from content_category;";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-5. minsanggu이 작성한 content의 title을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_5 = "select c.title from content c join user u on c.userId = u.id where u.name = 'minsanggu'; ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-6. minsanggu이 작성한 content의 category name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_6 = "select ca.name from category ca join content_category cc on ca.id = cc.categoryId join content c on cc.contentId = c.id join user u on u.id = c.userId where u.name = 'minsanggu';";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-7. category의 name이 java인 content의 title, body, created_at을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_7 = "select c.title, c.body, c.created_at from content c join content_category cc on cc.contentId = c.id join category ca on ca.id = cc.categoryId where ca.name = 'java';";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-8. category의 name이 java인 content의 title, body, created_at, user의 name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_8 = "select c.title, c.body, c.created_at , u.name from content c join user u on u.id = c.userId join content_category cc on c.id = cc.contentId join category ca on ca.id = cc.categoryId where ca.name = 'java';";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-9. teawoongna가 작성한 글의 개수 (컬럼명: ContentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_9 = "select count(*) as ContentCount from content c join user u on c.userId = u.id where u.name = 'teawoongna';";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-10. 각 user(컬럼명: name)가 작성한 글의 개수 (컬럼명: ContentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_10 = "select u.name as name, count(c.userId) as ContentCount from user u left join content c on u.id = c.userId group by u.id;";
}
