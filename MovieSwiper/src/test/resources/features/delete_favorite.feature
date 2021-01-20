@cucumber
Feature: Delete favorite movies
  As a fan of the movies
  I want to delete my favorite movies in the library

  @DeleteFavorite
  Scenario: User deletes a movie in his favorite library
  Narrative: The user is registered in Movie Swiper
    Given that _test_wolox is logged into the app
    When he deletes a favorite movie in his library
    Then he should not see the movie in his library My Favorite