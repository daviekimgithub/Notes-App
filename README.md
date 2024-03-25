# Note App with CRUD Operations using Jetpack Compose and Room

This is a simple Note App implemented with Jetpack Compose for UI, Room for local database storage, and Dagger for dependency injection. The app allows users to perform basic CRUD operations (Create, Read, Update, Delete) on notes.

## Features

- **List All Notes**: Display all existing notes in a scrollable list.
- **Add Note**: Add a new note with a title and description.
- **Edit Note**: Modify the title or description of an existing note.
- **Delete Note**: Remove a note from the list.

## Setup Instructions

Follow these steps to set up and run the app locally:

1. **Clone the Repository**: 
2. **Open Project in Android Studio**:
Open Android Studio and select "Open an existing Android Studio project". Navigate to the cloned repository and select the `build.gradle` file.
3. **Run the App**:
Connect an Android device or start an emulator. Then, click on the "Run" button in Android Studio to install and run the app on the selected device/emulator.

## Testing

### Unit Tests

The app includes unit tests for use cases. These tests ensure that the business logic of the app works correctly. To run the unit tests, follow these steps:

1. Navigate to the `src/test` directory in the project.
2. Right-click on the directory and select "Run 'Tests'".

### Instrumentation Tests

Instrumentation tests are included to verify the functionality of the Dagger setup and the behavior of the all notes screen. Follow these steps to run the instrumentation tests:

1. Navigate to the `src/androidTest` directory in the project.
2. Right-click on the directory and select "Run 'Tests'".

## Dependencies

- Jetpack Compose: Modern toolkit for building native Android UI.
- Room: Persistence library for local database storage.
- Dagger: Dependency injection framework for managing dependencies.
- JUnit: Framework for writing and running unit tests in Java.
- Espresso: Testing framework for UI tests in Android.
- Mockito: Mocking framework for unit tests in Java.

## Contributing

Contributions to improve this project are welcome! If you have suggestions, bug reports, or feature requests, feel free to open an issue or submit a pull request.
