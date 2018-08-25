Feature: International vote not behind ID, English Only

  @ukIp
  Scenario Outline: View INTERNATIONAL vote with vote state as open from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see vote and option

    Examples:
      | voteId  |
      | 8pOfeBw |

  @nonUkIp
  Scenario Outline: View INTERNATIONAL vote with vote state as open from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see vote and option

    Examples:
      | voteId  |
      | 8pOfeBw |

  @nonUkIp
  Scenario Outline: Submit INTERNATIONAL vote with vote state as open from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see vote confirmation

    Examples:
      | voteId  |
      | Le7nxEU |

  @ukIp
  Scenario Outline: Submit INTERNATIONAL vote with vote state as open from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see vote confirmation

    Examples:
      | voteId  |
      | 2Rt2b3z |

  @ukIp
  Scenario Outline: View INTERNATIONAL vote with vote state as pre-open from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as pre-open

    Examples:
      | voteId  |
      | Iow6EDr |

  @ukIp
  Scenario Outline: View INTERNATIONAL vote with vote state as closed from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as closed

    Examples:
      | voteId  |
      | LU3kYbM |

  @ukIp
  Scenario Outline: View INTERNATIONAL vote with vote state as finished from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as finished

    Examples:
      | voteId  |
      | CmOqGb2 |

  @nonUkIp
  Scenario Outline: View INTERNATIONAL vote with vote state as Pre-open from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as pre-open

    Examples:
      | voteId  |
      | Iow6EDr |

  @nonUkIp
  Scenario Outline: View INTERNATIONAL vote with vote state as closed from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as closed

    Examples:
      | voteId  |
      | LU3kYbM |

  @nonUkIp
  Scenario Outline: View INTERNATIONAL vote with vote state as finished from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as finished

    Examples:
      | voteId  |
      | CmOqGb2 |

  @nonUkIp
  Scenario Outline: View UK only vote with vote state as open from outside UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see outside UK message

    Examples:
      | voteId  |
      | 1ijrIwe |

  @ukIp
  Scenario Outline: Submit INTERNATIONAL vote with cap of more than one and vote state as open from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see vote confirmation
    And user should be able to see "VOTE AGAIN" text

    Examples:
      | voteId  |
      | 0rYBWr2 |

  @ukIp
  Scenario Outline: Submit INTERNATIONAL vote with hidden result and vote state as open from Non-UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see hidden result message

    Examples:
      | voteId  |
      | QgNKRaw |

  #@ukIp
  Scenario Outline: View INTERNATIONAL vote with invalid vote Id and vote state as open from UK IP
    Given unsigned in user opens INTERNATIONAL vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see error message corresponding to invalid vote Id

    Examples:
      | voteId  |
      | 1xjrI12 |
