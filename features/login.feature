Feature:
  Scenario:success Login
    Given user launch the chrome browser
    When user opens url "https://opensource-demo.orangehrmlive.com/"
    And the user enter the username as "Admin " and password as "admin123 "
    And click to login button
    Then close the browser


  Scenario Outline: Login Data Driven
    Given user launch the chrome browser
    When user opens url "https://opensource-demo.orangehrmlive.com/"
    And the user enter the username as "<username>" and password as "<password>"
    And click to login button
    Then close the browser
    Examples:
      | username |password
      |  Admin |admin123
      |  Admin |admin123
