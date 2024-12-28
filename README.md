Weather App

A modern Android weather application built with Kotlin and Java that provides real-time weather information and forecasts.

Features

Real-time weather data display

7-day weather forecast

Location-based weather information

Weather alerts and notifications

Temperature in both Celsius and Fahrenheit

Detailed weather conditions (humidity, wind speed, precipitation)

Beautiful and intuitive user interface

Technologies Used

Kotlin

Java

Android Architecture Components (ViewModel, LiveData)

Retrofit for API communication

Coroutines for asynchronous operations

Room Database for local storage

Dagger Hilt for dependency injection

Material Design components

OpenWeatherMap API

Prerequisites

Android Studio Arctic Fox or later

Kotlin 1.5.0 or later

Java 8 or later

Android SDK version 21 or later

OpenWeatherMap API key

Installation

Clone this repository

https://github.com/bintangsatriamulya/Weather-App

Open the project in Android Studio

Create a local.properties file in the root directory and add your OpenWeatherMap API key:

WEATHER_API_KEY=your_api_key_here

Architecture

This app follows Clean Architecture principles and MVVM pattern:

Data Layer: Repositories and data sources

Domain Layer: Use cases and business logic

Presentation Layer: ViewModels and UI components

Testing

The project includes both unit tests and instrumentation tests:

# Run unit tests
./gradlew test

# Run instrumentation tests
./gradlew connectedAndroidTest

Contributing

Fork the repository

Create your feature branch (git checkout -b feature/amazing-feature)

Commit your changes (git commit -m 'Add some amazing feature')

Push to the branch (git push origin feature/amazing-feature)

Open a Pull Request

License

This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments

OpenWeatherMap for providing weather data

Material Design for UI components

Android development community for helpful resources
