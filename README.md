# Weather App

A modern Android weather application built with Kotlin that provides real-time weather information and forecasts.

## Features

- Real-time weather data display
- 7-day weather forecast
- Location-based weather information
- Weather alerts and notifications
- Temperature in both Celsius and Fahrenheit
- Detailed weather conditions (humidity, wind speed, precipitation)
- Beautiful and intuitive user interface

## Technologies Used

- Kotlin
- Android Architecture Components (ViewModel, LiveData)
- Retrofit for API communication
- Coroutines for asynchronous operations
- Room Database for local storage
- Dagger Hilt for dependency injection
- Material Design components
- OpenWeatherMap API

## Prerequisites

- Android Studio Arctic Fox or later
- Kotlin 1.5.0 or later
- Android SDK version 21 or later
- OpenWeatherMap API key

## Installation

1. Clone this repository
```bash
https://github.com/bintangsatriamulya/Weather-App
```

2. Open the project in Android Studio

3. Create a `local.properties` file in the root directory and add your OpenWeatherMap API key:
```properties
WEATHER_API_KEY=your_api_key_here
```

## Architecture

This app follows Clean Architecture principles and MVVM pattern:
- **Data Layer**: Repositories and data sources
- **Domain Layer**: Use cases and business logic
- **Presentation Layer**: ViewModels and UI components

## Testing

The project includes both unit tests and instrumentation tests:

```bash
# Run unit tests
./gradlew test

# Run instrumentation tests
./gradlew connectedAndroidTest
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- OpenWeatherMap for providing weather data
- Material Design for UI components
- Android development community for helpful resources

