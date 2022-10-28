# Tonic | A music sorting API (Version 1)

![fath-3NgcTH0CFJg-unsplash.jpeg](https://res.craft.do/user/full/a49dbab3-70d3-4ed6-6520-6324300d3ee7/A8EE52CB-946B-400C-BA80-4287AE66B9DB_2/ZM2piYSZnRJK7edVvy8diHnJ7wJuYo7LkjLkyRIdyR4z/fath-3NgcTH0CFJg-unsplash.jpeg)

### Purpose of the project

Tonic is a Java REST API that will fetch records from a Spotify user's playlists and organise them by key, among other possible queries. Eventually, the app will implement the ability to detect a song's key with AI using the tools from the [Essentia open-source library](https://essentia.upf.edu) developed by the Pompeu Fabra University Barcelona's Music Technology Group.

Its name comes from the music theory term for the first note in a harmonic sequence.

> ### Technology Stack

- > **Spring Tool Suite 4** (development)
- > **MySQL Workbench** (data persistence)
- > **Postman** (checking request functionality)
- > **GitHub** (code repository)
- > **Spotify API** (obtaining JSON information about playlists and songs in real time)
- > **Jira** (project management)
- > **Confluence** (documentation templates)
- > **LucidChart** (ERD design before reproducing it on MySQL)
- > **Craft** (writing the documentation and formatting it with markdown)

> ### Functionality of the project

- > Getting information about a playlist from a MySQL database
- > Adding information about a playlist to the MySQL database
- > Deleting and updating information about a playlist in the database
- > Getting information about a song from a MySQL database
- > Adding information about a song to the MySQL database
- > Deleting and updating information about songs in the database
- > Querying the playlists and songs databases by artist, title, song key, and Spotify id

---

### How I expected the challenge to go, the process, and what I learnt.

I did not have many expectations to begin with, mostly because I didn't really know what an API was in the first place! It turned out to be something easier to understand than I had imagined. I thought we were supposed to develop a full application, and so I felt quite stressed since we kept leaving the project for the last few days. But when it came to finally do it, I slowly understood how all the little pieces of the puzzle fit together—how everything we had learnt over the weeks of Java lessons could be applied to make an API.

Initially, since I thought we would be making a really complex project (and despite how scared of it I was), I came up with an idea that incorporated a lot of different functionalities and over time I realised it was unrealistic to expect all of it to be done. However, even though the API concept got simplified, I do plan on developing this project further, so it is very much a work in progress.

Through making this project, I learnt what CRUD operations were and how they worked. I also learnt how to use a lot of Java and Spring Boot functionalities, and the basics of JUnit testing and mocking class objects with Mockito. I also got a deeper understanding of how GitHub and local Git repositories work, and discovered a few new software tools like Craft (writing software) and LucidChart (diagram creating cloud tool).

Unfortunately I did not understand properly how to create the tests, so that is the area of the project that is lacking the most functionality. Therefore, moving forward I will take some time to understand this area properly and make sure I test the units and integrations.

---

### 📊 Initial project goals (requirements list with MoSCoW prioritisation)

This was the (admittedly-messy) initial list of requirements I made when I started conceptualising the project. The process has obviously changed since then, [as can be seen on my Jira board](https://anneklein.atlassian.net/jira/software/projects/KD/boards/4), but I still intend to implement some of the additional functionality on here, and eventually add a front-end.

| **🗂️ Requirement**                                                                                       | **📌Priority**           | **📝 Notes**                                                                                                                      |
| --------------------------------------------------------------------------------------------------------- | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
| Run Essentia software (Python/js) through user library db                                                 | ::could have::           | Use the Key and Key Extractor algorithms                                                                                          |
| Create database sorted by key                                                                             | ::must have::            |                                                                                                                                   |
| Create README.md                                                                                          | ::must have::            | Craft for markdown                                                                                                                |
| Take user requests by a) key, b) playlist, c) artist, d) album, or e) full library analysis (saved songs) | ::must have::            | See Tunebat for basic functionality—they use Essentia. Make a basic query system with MySQL first                                 |
| Create risk assessment                                                                                    | ::should have::          | Use Confluence template                                                                                                           |
| Import user library data from Spotify API into app database                                               | ::should have::          | Spotify API is also able to fetch the key of a song, if there is no time to implement the Essentia software                       |
| Link app with Spotify account                                                                             | ::should have::          | User input/log in screen                                                                                                          |
| Save search into new playlist                                                                             | ::won't have::           |                                                                                                                                   |
| Sync new playlist with Spotify user?                                                                      | ::won't have::           |                                                                                                                                   |
| Front-end interface                                                                                       | ::won't have (for now):: | Ask Jhonny for help if we make it into a web front-end, or wait until I can make it into an iOS app when I'm proficient in Swift! |

---

### Project Management with Jira, documentation with Confluence

I used a [Jira Kanban board](https://anneklein.atlassian.net/jira/software/projects/KD/boards/4) to keep track of my project, since I knew I was bound to get confused with the multiple classes and packages and the three main software apps we were using (Spring Tool Suite, Postman, and MySQL Workbench). Some small or quick tasks were not recorded on the Jira board, but even so, it helped me have a clear idea of where I was at each moment.

![Screenshot 2022-10-28 at 13.18.31.jpeg](https://res.craft.do/user/full/a49dbab3-70d3-4ed6-6520-6324300d3ee7/72A6CAB6-96ED-45CE-8D27-C3B3B78AB49D_2/ePwjZSjZsbnKpxjtZbHI9AIvEgq2t3y5Dgl7sCGY9Coz/Screenshot%202022-10-28%20at%2013.18.31.jpeg)

All the issues were grouped under the epic named Bootcamp MVP, and I synced them with my Git commits by using Jira's GitHub integration. This way, every time I pushed a commit to this repository, I referenced it with the corresponding issue name. This, combined with a couple automation features I added on Jira, meant that whenever I pushed a part of my code that corresponded to an unsolved issue, the issue not only synced with the right GitHub commit but it also moved the issue from "To-do" to "Done".

![Screenshot 2022-10-28 at 18.00.12.jpeg](https://res.craft.do/user/full/a49dbab3-70d3-4ed6-6520-6324300d3ee7/EA271AF2-D03A-43A4-86D5-448BEB64A334_2/cHQo4xOOHm11sFsBxckvEs3znP5usP9zKkI9lDVRlAsz/Screenshot%202022-10-28%20at%2018.00.12.jpeg)

![Screenshot 2022-10-28 at 18.01.00.jpeg](https://res.craft.do/user/full/a49dbab3-70d3-4ed6-6520-6324300d3ee7/7F096DE4-1687-466F-A679-A1A7DBA8FD9A_2/fAwdtq0Tw5qfZ0O4EGvbsF00p0ovHUmfMBj5UxwwgRsz/Screenshot%202022-10-28%20at%2018.01.00.jpeg)

I also used Confluence briefly to plan my project documentation (risk assessment, controller method checklist), since the templates in there are very much geared towards software development and project management with Jira. This was very useful, but in the end I discovered a writing program called Craft that integrated well with markdown, and so I transferred the documents to Craft and have worked with it for most of the project.

---

### How to use this API

- First, you have to execute the .jar file (located in the main branch of the repository > root folder) and connect to your local MySQL database, using a TomCat server included in the Fat Jar.
- This API is meant for use through Postman or a similar tool. It uses port 8080 on your local server, so the main link you will have to use in your Postman requests will be http://localhost:8080/{custom request you want to execute}
- The requests you can currently perform with this API are the following:

| **PLAYLIST REQUESTS** | **SONG REQUESTS** | **CRUD FUNCTIONALITY** |
| --------------------- | ----------------- | ---------------------- |
| /addPlaylist          | /addSong          | post                   |
| /allPlaylists         | /allSongs         | get                    |
| /updatePlaylist/{id}  | /updateSong/{id}  | put                    |
| /deletePlaylist/{id}  | /deleteSong/{id}  | delete                 |
| /playlistById/{id}    | /songById/{id}    | get                    |
| /playlistByTitle      | /songByKey        | get                    |
|                       | /songByArtist     | get                    |
|                       | /songByTitle      | get                    |

- Currently, the database includes three of my own playlists:
   - **"Down to Earth | Restart"**, with Spotify ID *4u6X7rSLR6Dt7pAdrN5rQk*
   - **"Jade City"**, with Spotify ID *0Jxtpz6f4xDBjiT7Qo7h0z*
   - **"Curse of Strahd: A D&D campaign"**, with Spotify ID *5NkzoFRj4qGebTjTvsRS6i*
- Using the Spotify web API, however, you can obtain data about your own playlists and subsequently add them to your local instance of the Tonic database. To do this, you need to access the Spotify API console [here](https://developer.spotify.com/console/).
   - Please keep in mind the Spotify API will return the key using [Integer Notation](https://en.wikipedia.org/wiki/Pitch_class). If you see numbers on the database column for key, that's correct.

---

### Project structure on Spring Tool Suite

![Screenshot 2022-10-28 at 17.53.19.jpeg](https://res.craft.do/user/full/a49dbab3-70d3-4ed6-6520-6324300d3ee7/doc/A2A4B267-75E3-43B4-A3D5-1D2796962086/D938EAAD-C96B-425C-B0AE-843D0E0CF0F4_2/9qAYF0P8Qpychfr8DbuLBWxQQk8gzSGuk2AnPGPLzWIz/Screenshot%202022-10-28%20at%2017.53.19.jpeg)

### Pending requirements to work on in order of priority

**(Screenshots of successful execution pending)**

- [ ] Postman requests keep giving error 404
- [ ] Testing still needs to be written

