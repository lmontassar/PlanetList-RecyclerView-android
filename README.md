# PlanetList-RecyclerView-Android

## Description
This Android application displays a list of planets in our solar system using a RecyclerView. It demonstrates the implementation of RecyclerView, custom adapters, and basic UI design in Android development.

## Features
- Displays a list of planets with their names, descriptions, and images
- Utilizes RecyclerView for efficient list rendering
- Custom adapter to bind planet data to list items

## Implementation Details

### Main Components
1. **RecyclerView**: Added in `activity_main.xml` to display the list of planets.
2. **Planet Class**: A model class representing planet data (name, description, image resource ID).
3. **PlanetAdapter**: Custom adapter extending `RecyclerView.Adapter` to manage data binding.
4. **ViewHolder**: Inner class in PlanetAdapter to hold references to item views.

### Layout Files
- `activity_main.xml`: Contains the RecyclerView
- `item_planet.xml`: Defines the layout for individual planet items in the list

### Data Source
A list of `Planet` objects is created in the main activity to populate the RecyclerView.

## Setup
1. Clone the repository
2. Open the project in Android Studio
3. Run the application on an emulator or physical device

## Screenshots
![8](https://github.com/user-attachments/assets/c67821b7-2061-4aa9-9b2b-6adb9dd52f15)

## Authors
- [CHOUKANI HALIM](https://github.com/halimchoukani)
- LOUNISSI MONTASSAR

## Acknowledgments
This project was developed as part of the Mobile Development course, focusing on RecyclerView and Solar System visualization.
