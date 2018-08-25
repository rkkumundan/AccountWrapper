# account-wrapper-test-e2e
Account Wrapper Functional E2E Test serenity framework

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

## Prerequisites

- Java `1.8.x`
- maven `3.x` or `3.5.x` or _latest and greatest_ (you would need a `settings.xml` file if you do not have already)
- An editor like `IntelliJ` would be useful!
- A valid developer certificate to enable you to get dependencies from artifactory


### Installing

A step by step series of examples that tell you how to get tests running locally.
```
git clone https://github.com/bbc/account-wrapper-test-e2e.git
```

Confirm you can retrieve all dependencies by running
```
mvn dependency:resolve
```

### Running Tests

#### Running tests locally in different browsers

- mvn verify -P firefox

- mvn verify -P chrome

- mvn verify -P safari

- mvn verify -P IE

- mvn verify -P edge

#### Running tests in Browser Stack

- mvn verify -P single

- mvn verify -P parallel

- mvn verify -P iphoneBS

- mvn verify -P samsungGalaxyS5BS

- mvn verify -P windowsDesktop

- mvn verify -P macintoshDesktop

### Running tests in multi-browser and multi-environment

- mvn verify -Dcontext=chrome -Dwebdriver.driver=chrome

- mvn verify -Dcontext=firefox -Dwebdriver.driver=firefox
