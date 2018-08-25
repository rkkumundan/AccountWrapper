Feature: UK only vote not behind ID, English Only

  @ukIp
  Scenario Outline: View UK vote with vote state as open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see vote and option

    Examples:
      | voteId  |
      | LrAJmEd |

  @nonUkIp
  Scenario Outline: View UK vote with vote state as open from Non-UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see outside UK message

    Examples:
      | voteId  |
      | LrAJmEd |

  @ukIp
  Scenario Outline: Submit UK vote with vote state as open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see vote confirmation

    Examples:
      | voteId  |
      | AwA1Eqm |

  @ukIp
  Scenario Outline: View UK vote with vote state as pre-open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as pre-open

    Examples:
      | voteId  |
      | lcdPUrk |

  @ukIp
  Scenario Outline: View UK vote with vote state as closed from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as closed

    Examples:
      | voteId  |
      | dtOEK6f |

  @ukIp
  Scenario Outline: View UK vote with vote state as finished from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should see respective messages corresponding to vote state as finished

    Examples:
      | voteId  |
      | XLboIFV |

  @nonUkIp
  Scenario Outline: View UK vote with vote state as Pre-open from Non-UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see outside UK message

    Examples:
      | voteId  |
      | lcdPUrk |

  @nonUkIp
  Scenario Outline: View UK vote with vote state as closed from Non-UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see outside UK message

    Examples:
      | voteId  |
      | dtOEK6f |

  @nonUkIp
  Scenario Outline: View UK vote with vote state as finished from Non-UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see outside UK message

    Examples:
      | voteId  |
      | XLboIFV |

  @ukIp
  Scenario Outline: Submit UK vote with cap of more than one and vote state as open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see vote confirmation
    And user should be able to see "VOTE AGAIN" text

    Examples:
      | voteId  |
      | Tpbmgdm |

  @ukIp
  Scenario Outline: Submit UK vote with hidden result and vote state as open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    When user submits vote
    Then user should be able to see hidden result message

    Examples:
      | voteId  |
      | 1rBlAOQ |

  #@ukIp
  Scenario Outline: View UK vote with invalid vote Id and vote state as open from UK IP
    Given unsigned in user opens UK vote with voteId as "<voteId>"
    Then user should be able to see loaded vote in "en_GB" language
    And user should be able to see error message corresponding to invalid vote Id

    Examples:
      | voteId  |
      | XLboI09 |
