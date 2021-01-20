@cucumber
Feature: Add favorite movies
  As a fan of the movies
  I want to add my favorites movies in the library

  @AddFavoriteFromBrowse
  Scenario: User adds a movie in the favorite library from the Browse Page
  Narrative: The user is registered in Movie Swiper
    Given that test_wolox is logged into the app
    When he adds a movie as favorite from the browse page
    Then he should see the movies in his library My Favorite

  @AddFavoriteFromExplore
  Scenario: User adds a movie in the favorite library from the Explore Page
  Narrative: The user is registered in Movie Swiper
    Given that test_wolox is logged into the app
    When he adds a movie as favorite from the explore page
    Then he should see the movies in his library My Favorite

  @AddRemastered
  Scenario Outline: User adds a remastered movie in the favorite library
  Narrative: The user is registered in Movie Swiper
      Given that test_wolox is logged into the app
      When he adds a remastered <movie> as favorite
      Then he should see the movies in his library My Favorite

      Examples:
      | movie |
      | Aladdin |
      | Mulan   |

  @GuestUser
  Scenario: Guest can't adds a movie in the favorite list
  Narrative: The user is a guest in Movie Swiper
    When the guest try to adds a movie as favorite
    Then he should see the warning message in the Library
