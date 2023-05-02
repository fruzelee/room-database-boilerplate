# CHANGELOG

All notable changes to this project will be documented in this file.

# v1.0

- feat: add .gitignore
- feat: first commit
- build(dependencies): add room library
- feat(entity): creating our table
- feat(dao): create DAO (data access object) for the contact table
- feat(database): create database

BREAKING CHANGE: 3 steps are done to use local database using ROOM:
step 1: create entity table
step 2: create DAO
step 3: create database

- feat(event): add various event
- feat(state): create state class that combines the screen state including contact list, selected
  radio button, show or hide the dialog etc.
- feat(viewModel): add view model to map our states and events
- feat(ui): create contact screen
- feat(ui): create contact dialog