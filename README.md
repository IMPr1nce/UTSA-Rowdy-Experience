# RowdyExperience

RowdyExperience is an Android application built with Kotlin and Java as part of a university course project under CS3443 at UTSA. This app provides a platform for UTSA students to log in, create accounts, and access dashboard functionalities for an enhanced campus experience.

## Features

- User authentication (Login and Create Account)
- Checklist view for tracking campus-related tasks
- Intuitive user interface tailored for student engagement

## Project Structure

    rowdyexperience/
    ├── app/
    │   ├── src/
    │   │   └── main/
    │   │       ├── java/
    │   │       │   └── edu/
    │   │       │       └── utsa/
    │   │       │           └── cs3443/
    │   │       │               └── rowdyexperience/
    │   │       │                   ├── MainActivity.java
    │   │       │                   ├── CreateUserActivity.java
    │   │       │                   ├── DashboardActivity.java
    │   │       │                   ├── ChecklistActivity.java
    │   │       │                   └── model/
    │   │       ├── res/
    │   │       ├── AndroidManifest.xml
    ├── build.gradle.kts
    ├── settings.gradle.kts
    ├── gradlew
    ├── gradlew.bat

## Getting Started

### Prerequisites

- Android Studio Electric Eel or later
- Java 11 or higher
- Kotlin Plugin
- Gradle 7.x

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/IMPr1nce/rowdyexperience.git
    ```
2. Open the project in Android Studio.
3. Let Gradle sync and build the project.
4. Run the app on an emulator or connected Android device.
   
## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests for new features or bug fixes.

## License

This project is licensed under the MIT License.
