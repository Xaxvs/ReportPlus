# ReportPlus

**ReportPlus** is a simple, flexible, and fully GUI-driven player reporting plugin for Spigot/Paper servers. Give your players an easy way to report suspected cheaters while giving staff a clear, organized report management system.

## Features

- **GUI-based reporting**: `/report <player>` opens a menu where the reporter can choose the reason for the report.
- **Configurable report types**: Add, remove, and customize report reasons with your preferred item material, display name, lore, and GUI slot.
- **Built-in report reasons**: Includes BHOP, NUKER, AIMBOT, FLYING, KILL AURA, VELOCITY, and AUTO CLICKING by default.
- **Live report alerts**: Staff with the alert permission receive the reported player, reporter, type, and timestamp as soon as a report is submitted.
- **Alert toggle**: Staff can enable or disable report notifications with `/reports toggle`. Their preference is saved.
- **Paginated report list**: View up to 45 reports per page in a staff-only GUI.
- **Report filters**: Filter the report list to show all, open, or resolved reports.
- **Report details and actions**: Select any report to resolve or delete it, or return to the report list.
- **Open and resolved states**: Track which reports still need attention and which have already been handled.
- **Command management**: Resolve or delete reports directly by player name, with a GUI selection when a player has multiple reports.
- **Report cooldown**: Prevent spam by configuring how often a player may submit a report.
- **Duplicate-safe player tracking**: Player data is stored by UUID while supporting case-insensitive player-name lookup and name updates.
- **Persistent YAML storage**: Reports, player data, alert preferences, cooldowns, report states, and timestamps survive restarts.
- **Data migration and repair**: Existing report data is migrated into the player data system, and recoverable missing fields are repaired automatically.
- **Customizable messages**: Edit `Lang.yml` to customize command messages, alerts, GUI titles, item names, lore, and placeholders.
- **Tab completion**: Quickly complete report subcommands and known player names.
- **Built-in bStats metrics**: Anonymous usage metrics help guide future development.
- **Self-report protection**: Players cannot report themselves.
- **Permission-based access**: Separate permissions for reporting, receiving alerts, and managing reports.

## Commands

| Command | Description |
|---|---|
| `/report <player>` | Open the report reason menu for a player. |
| `/reports` | Open the staff report list. |
| `/reports toggle` | Toggle report alerts for yourself. |
| `/reports resolve <player>` | Resolve a player's report; opens a selection menu if multiple reports exist. |
| `/reports delete <player>` | Delete a player's report; opens a selection menu if multiple reports exist. |

## Permissions

| Permission | Description |
|---|---|
| `ReportPlus.player_report` | Report players. |
| `ReportPlus.report_alert` | Receive report alerts and toggle them. |
| `ReportPlus.list_reports` | View, resolve, and delete reports. |

## Configuration

ReportPlus is highly configurable:

- Set the report cooldown in seconds.
- Create custom report types.
- Choose the material, colored display name, lore, and menu slot for each type.
- Customize all messages and GUI text in `Lang.yml`.

The default report types are:

`bhop`, `nuker`, `aimbot`, `flying`, `kill-aura`, `velocity`, and `auto-clicking`.

## Installation

1. Download the latest `ReportPlus.jar`.
2. Place it in your server's `plugins` folder.
3. Start or restart the server.
4. Configure `plugins/ReportPlus/config.yml` and `Lang.yml` as desired.

## Support and Suggestions

Feedback, bug reports, and feature suggestions are welcome. Join the [Discord server](https://discord.com/invite/7d5t8C3SF6) to get in contact.

![bStats Metrics](https://bstats.org/signatures/bukkit/ReportsPlus.svg)
