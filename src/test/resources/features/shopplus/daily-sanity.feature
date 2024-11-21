@sanity @aladinmall @payment

Feature: Payment

  Background: Open main page
    Given user access page aladinmall
    When user click on masuk button
#    And user input email "dieudonne.jordy@misteraladin.com" and password "thefthing123"
    And user input email "snipangeling123@gmail.com" and password "86527873"

  @payment
  Scenario: Shopee
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Shopee
    And system display thank you page

  @payment
  Scenario: Gopay
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Gopay
    And system display thank you page

  @payment
  Scenario: OVO
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method OVO "8111092799"
    And system display thank you page

  @payment
  Scenario: BCA
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Virtual Account BCA
    And system display thank you page

  @payment
  Scenario: BRI
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Virtual Account BRI
    And system display thank you page

  @payment
  Scenario: MNC Bank
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Virtual Account MNC Bank
    And system display thank you page

  @payment
  Scenario: Permata
    Then user added product "4UT0M4T10NT3ST!N6" to cart
#    Then user added product "Botol Air Panas" to cart
    Then user click on cart icon
    And user click on select all product
    Then user click checkout
    And user select courier SAP Regular
    Then user select payment method Virtual Account Permata
    And system display thank you page