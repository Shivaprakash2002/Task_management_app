package com.newproject;

//Addtask class
class Addtask {
 private String title;
 private String description;
 private String priority;
 private String status;

 public void setTitle(String title) {
     if (title != null && !title.isEmpty()) {
         this.title = title;
     }
 }

 public void setDescription(String description) {
     if (description != null && !description.isEmpty()) {
         this.description = description;
     }
 }

 public void setPriority(String priority) {
     if (priority != null && !priority.isEmpty()) {
         this.priority = priority;
     }
 }

 public void setStatus(String status) {
     if (status != null && !status.isEmpty()) {
         this.status = status;
     }
 }

 @Override
 public String toString() {
     return "Task [title=" + title + ", description=" + description + ", priority=" + priority + ", status=" + status + "]";
 }}
