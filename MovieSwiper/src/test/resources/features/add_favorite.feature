@cucumber
Feature: Add favorite movies
  As a fan of the movies
  I want to add my favorite movies in the library

  @FavoriteMovieFromBrowse
  Scenario: User adds a movie in the favorite list from Browse Page
  Narrative: The user is registered in Movie Swiper
    Given that camiloandresru is logged into the app
    When he adds a movie as favorite from browse page
    Then he should see the movies in his library My Favorite

  @FavoriteMovieFromExplore
  Scenario: User adds a movie in the favorite list from Explore Page
  Narrative: The user is registered in Movie Swiper
    Given that camiloandresru is logged into the app
    When he adds a movie as favorite from explore page
    Then he should see the movies in his library My Favorite

  @GuestUser
  Scenario: Guest can't adds a movie in the favorite list
  Narrative: The user is a guest in Movie Swiper
    When the guest try to adds a movie as favorite
    Then he should see the warning message in the Library
