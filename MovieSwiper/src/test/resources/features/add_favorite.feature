@cucumber
Feature: Add favorite movies
  As a fan of the movies
  I want to add my favorite movies in the library

  @RegisteredUser
  Scenario Outline: User adds a movie in the favorite list
  Narrative: The user is registered in Movie Swiper
    Given that <user> is logged into the app
    When he adds to <movie> as favorite
    Then he should see the movies in his library My Favorite

    Examples:
      | user  | movie |
      | camiloandresru  | Mulan |

  @UnregisteredUser
  Scenario: Guest can't adds a movie in the favorite list
  Narrative: The user is a guest in Movie Swiper
    When the guest try to adds a movie as favorite
    Then he should see the warning message in the Library