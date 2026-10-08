# Gaming Setup mod - Stage 1 (Fabric, Minecraft 1.21.11)

## Setup
1. Go to https://fabricmc.net/develop , choose Minecraft 1.21.11, mod id `gamingsetup`, package `com.gamingsetup`, download the template.
2. Delete the template's example `src/main/java` code and `src/main/resources`.
3. Copy this project's `src/` folder into the template (overwrite).
4. Run `./gradlew runClient` (JDK 21).

## Using it (creative inventory > Functional Blocks)
- Place a Gaming PC and a redstone block within 3 blocks of it.
- Right-click the PC to start it (it glows). Right-click again to turn it off. Removing the redstone block shuts it down.
- Link Cable: right-click a monitor, then right-click the PC (do not sneak). Max 16 blocks. One PC can have many monitors.
- Monitor shows: "PC NOT CONNECTED" (no cable), black (PC off), desktop (PC on).

Written without being able to compile; if the build reports an error, send it back and it will be fixed.
