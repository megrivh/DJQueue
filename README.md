
# DJQueue

Welcome to **DJQueue**, an interactive music request and voting application designed to give event guests control over the music being played. Built using **Sprint Boot (backend)** and **Flutter (frontend)**, DJQueue allows users to request songs, vote on them, and influence the playlist in real time, creating a more engaging and dynamic party atmosphere.

This project is currently **in development**, with core features being actively implemented. DJQueue highlights my ability to build a full-stack, cross-platform application, integrating secure authentication, a RESTful API, and an interactive mobile UI.

## Table of contents

* [Project Overview](#project-overview)
* [Problem and Solution](#problem-and-solution)
* [Key Features](#key-features)
* [Technologies and Tools](#technologies-and-tools)
* [Future Enhancements](#future-enhancements)
* [Installation and Setup](#installation-and-setup) (Coming Soon!)
* [Current Development Status](#current-development-status)
* [Why This Project?](#why-this-project)
* [Contributing](#contributing)
* [Repository and Project Updates](#repository-and-project-updates)

## Project Overview

**DJQueue** is a real-time playlist management system that allows event hosts and guests to collaborate on music selection. Instead of a traditional DJ controlling the playlist, guests can request songs and vote on them, influencing the order in which they are played. 

Hosts can set custom voting rules (e.g., request limits, cooldowns), and guests can join events via a QR code or access code, eliminating the need for account registration.

## Problem and Solution

### The Problem

Music is a key factor in shaping the atmosphere at parties and events, yet guests often have little to no control over what is being played.
- DJs may not know what the crowd wants to hear, leading to a less engaging event.
- When DJs do take request, there's no structured way to manage them efficiently.
- At casual events without a DJ, one person controls the music, but everyone else wants input.
- Constantly asking the DJ to play requested songs can be distracting for them and frustrating for guests.

### The DJQueue Solution

**DJQueue** provides a structured and interactive way for event attendees to participate in music selection, improving the experience for guests, hosts, and DJs.
- **Event-Based Access:** Hosts create an event and share a QR code or access code for guests to join.
- **Crowd-Controlled Playlists:** Guests request songs and vote to determine the playlist order.
- **Smart Voting System:** Upvoted songs play sooner, while downvoted songs move down the queue.
- **Host Customization:** Hosts set voting rules for song requests and voting to maintain balance and fairness.
- **Less DJ Distruption:** Reduces verbal song requests, allowing DJs and event hosts to focus on the experience.

**DJQueue bridges the gap between DJ control and audience participation**, ensuring the right music plays at the right time for every crowd! 

## Key Features

### For Event Hosts:

- **Create Events & Playlists:** Set up an event and add an initial song queue.
- **Custom Voting Rules:** Control guest interaction (e.g., max song requests per guest, vote frequency) 
- **Secure Host Controls:** Approve or reject song requests, skip songs, or lock the playlist. 
- **Code-Based Access:** Generate an access code or QR code for easy guest participation.

### For Guests:

- **Join an Event:** Enter via QR code or access code.
- **Request Songs:** Add new songs to the playlist (within host-defined limits).
- **Upvote/Downvote Songs:** Influence the order of the playlist.
- **View the Live Playlist:** See which songs are queued next based on vote rankings.

## Technologies and Tools

This project highlights my ability to build a scalable, secure, and interactive full-stack application.

### Backend

- **Java SE 21:** Core backend development
- **Spring Boot:** RESTful API for event and user management
- **Spring Security:** Authentication and role-based access
- **MySQL:** Persistent storage for users, playlists, and events
- **BCrypt:** Secure password hashing

### Frontend

- **Dart & Flutter:** Cross-platform mobile UI
- **HTTP package:** API integration with the backend
- **Flutter_dotenv:** Manages environment variables

## Future Enhancements

- **WebSocket integration:** Real-time playlist updates without refreshing
- **Cloud storage for playlists:** Persistent event history
- **OAuth integration:** Social login options

## Installation and Setup

Instructions will be provided once the project is ready for setup and deployment. 

## Current Development Status

**DJQueue** is currently in active development, with key functionalities being built **iteratively**.
- **Backend:** User authentication and database integration implemented.
- **Frontend:** Initial Flutter UI setup for login **in progress**.
- **Next Steps:**
    - Implement playlist management and voting system (upvotes/downvotes)
    - Add access code-based event entry for guests
    - Integrate WebSocket for real-time playlist updates

## Why This Project?

This project reflects my skills in full-stack development, security, and interactive UI design, particularly in: 
- Building secure, scalable APIs using Spring Boot & MySQL
- Implementing authentication & role-based access control
- Developing a cross-platform mobile UI with Flutter
- Creating interactive & real-time applications

**DJQueue is an evolving personal project**, designed to solve a real-world problem with a structured and scalable approach. It showcases my problem-solving skills and my ability to take an idea from concept to implementation while following best practices in software development, security, and user experience design. 

## Contributing
At this time, **contributions are not open**, as the project is actively being developed. Once the core features are in place, I plan to welcome collaboration and feature suggestions. 

**Stay tuned for updates!**

## Repository and Project Updates
This repository will be updated as features are implemented. Check back for new commits, and feel free to explore the progress!




