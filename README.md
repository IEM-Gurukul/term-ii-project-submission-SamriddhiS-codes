[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Smart Task Scheduler with Dynamic Priority Management

## Problem Statement (max 150 words)

Managing multiple tasks with varying priorities and deadlines is challenging for students and professionals. Traditional task management systems rely on static prioritization, which does not adapt when deadlines approach or priorities change. This often leads to inefficient scheduling and missed deadlines.

This project proposes a Smart Task Scheduler that dynamically adjusts task priorities using different scheduling strategies such as fixed priority and deadline-based prioritization. The system also provides real-time updates using an observer mechanism. The goal is to build a flexible and extensible system using Object-Oriented Programming principles that improves productivity and task organization.

## Target User

1. Students managing assignments and deadlines
2. Developers handling multiple tasks
3. Professionals managing work schedules

## Core Features

-Add, update, and delete tasks
-Priority-based and deadline-based scheduling
-Dynamic switching of scheduling strategies
-Task status tracking (Pending, Completed)
-Observer notifications for task updates
=Input validation and error handling

## OOP Concepts Used

-Abstraction:
Task abstract class defines common structure
-Inheritance:
WorkTask, PersonalTask, and UrgentTask extend Task
-Polymorphism:
Scheduling strategies are switched dynamically at runtime
-Exception Handling:
Handles invalid inputs such as incorrect date format
-Collections:
Uses ArrayList to manage tasks dynamically

---

## Proposed Architecture Description
The system follows a modular object-oriented architecture. The Task class acts as a base abstraction, with multiple subclasses representing different types of tasks. The SchedulerManager manages all tasks and applies scheduling strategies dynamically using the Strategy Pattern.

The SchedulingStrategy interface allows switching between different priority calculation methods at runtime. Additionally, the Observer Pattern is implemented to notify components when tasks are added or completed.

This design ensures loose coupling, scalability, and ease of extension.
---

## How to Run
-Clone the repository
-Open the project in IntelliJ IDEA
-Navigate to Main.java
-Run the program
-Use the console menu to:
-Add tasks
-View tasks
-Switch strategies
-Complete tasks
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
