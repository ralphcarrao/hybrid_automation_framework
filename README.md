### Latest version: 4.8.0
### Release date: 29 November 2018

----

## Version 4.8.0 (29 November 2018)

### Compatible Software:
* Ahsay 8.0.2.0
* CBK 3.5.0.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.138.1
* Newman 4.1.0
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0
* Katalon 5.7.1

### Major features:
* Katalon - CBS Languages operations
* Katalon - CBS Connectors operations
* Katalon - Check the functions of icon on CBS Manage Backup User Page
* Katalon - CBS Host Quota Checking
* Katalon - QNAP Automation Integration
* Sikuli - Export CBS GUI logged Error using Katalon on Sanity CBS
* Jenkins - Change the sikuli execution case name from editable text field to editable drop down list on Jenkins

### Minor features:
* Katalon - CBS console login cases
* Katalon - Support JAR Build Testing in Branding Case
* Sikuli - Print CPU and Memory Usage when case failed

### Major Bug fixes:
* Sikuli - Fix Hang when running click on Sikuli (Java 1.8)
* Sikuli - DIC Behaviour Changes during migration stage 1-3 (#22439)
* Sikuli - Reorder Office365 Email Address to avoid conflict
* Sikuli,Environment - Handle Java Update Prompt during Execution
* Sikuli,Selenium - Update Amazon Cloud Drive Sign In Button for getting AuthCode
* Sikuli - Update AWS compatible credentials
* Katalon,Sikuli - Tune Katalon Action Delay

----

## Version 4.7.0 (31 October 2018)

### Compatible Software:
* Ahsay 7.17.0.50
* CBK 3.5.0.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.138.1
* Newman 4.1.0
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0
* Katalon 5.7.1

### Major features:
* Katalon - Improve the branding test case (System Admin, Non Default System Admin, Sub Admin) (1st & 2nd level)
* Katalon - Support CBS [Users, Groups & Policies] basic checking
* Katalon - Support CBS Sub Admin
* Environment - Set Up a machine (10.10.0.37) dedicate for CBS Katalon Automation
* Sikuli - Separate the upgrade OBC case to backward compatibility of only one previous OBC version in each case

### Minor features:
* API - Get Backup and Restore Status of Run On Server Backup Set
* API - Upgrade Newman to v4.1.0 and Enhance html template
* Sikuli - Merge code for Run On Server Cloud File Backup Set in Sikuli and Katalon
* Katalon - Split test case by each tab on CBS Page
* Katalon - Merge Sub Admin Console Case and User Console Case in Sikuli
* Environment, Jenkins - Jenkins Job Stabilizing (Upgrade Jenkins Server & Agent)

### Major Bug fixes:
* Sikuli - Fix Hang when running click on Sikuli (Sanity Test Workflow)
* Sikuli, Katalon - Fix automation code due to changes in v8.0.1.0
* Katalon - Restore to Alternate Location of Run On Server Cloud File Backup Set

----

## Version 4.6.0 (28 September 2018)

### Compatible Software:
* Ahsay 7.17.0.30
* CBK 3.5.0.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.107.3
* Newman 3.9.2
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0
* Katalon 5.5.0.1

### Major features:
* Katalon - Check Download Page accessible / clickable before & after branding CBS (#22149)
* Katalon - Screen Errors on CBS [Administration Logs] > [Activities Log]
* Katalon - Migrate Branding Workflow from Selenium to Katalon
* Katalon - Support CBS User Console (Create Backup Set)
* Katalon - Support CBS User Console ( Menu Page + Sub Page Assertion)


### Minor features:
* Katalon - CBS System Admin Console - Progressive DIC Page Assertion
* Sikuli - Copy getAllFlags Folder into the Migration CBS VM
* Sikuli - Close Firefox after getting authentication code of browser related destinations

### Major Bug fixes:
* Sikuli, API - Update hostname to Non Empty Value after installing CBS
* Selenium - Update xpath of Run On Server Backup Set Execute Job Column
* Sikuli - Shorten OBM_SHORT_NAME_SYSTEM in branding.json due to #21849
* API - Fix API changes in 7.17.0.30

----

## Version 4.5.0 (31 August 2018)

### Compatible Software:
* Ahsay 7.17.0.0
* CBK 3.5.0.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.107.3
* Newman 3.9.2
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0
* Katalon 5.5.0.1

### Major features:
* Sikulix #1: Support v6 Data Migration with 300 Jobs
* Sikulix #2: Check the backup performance of file50000 cases is less than 30 minutes
* Katalon #1: Support Screening on ivy.ahsay.com CBS about Errors on [To Do] & [Activities Log]
* Katalon #2: Support QNAP login
* Katalon #3: Support QNAP OBM functions by fine tuning the codes used for Synology OBM


### Minor features:
* Katalon #1: Support default user home path according to Windows / Linux OS

### Major Bug fixes:
* Sikulix #1: Expand Node on Office 365 backup set due to code change in #16274, #21714, #21715
* Sikulix #2: Edit Delete destination / backup set behaviour due to code change in #20477
* Sikulix #3: Reserve enough CPU and Memory for Automation Machines
* Katalon #1: Added wait time after selected restore jobs in NAS OBM
* Katalon #2: Separate the global timeout for common loading splash and restore completion

----

## Version 4.4.0 (31 July 2018)

### Compatible Software:
* Ahsay 7.15.6.55
* CBK 3.3.2.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.107.3
* Newman 3.9.2
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0
* Katalon 5.5.0.1

### Major features:
* Sikulix #1: Support Integration with Katalon
* Sikulix #2: Support Running Katalon CBS Flow
* Sikulix #3: Support Running Katalon Synology OBM Flow
* Katalon #1: Generate CBS Object Repository
* Katalon #2: Migrate existing Selenium IDE flow on CBS to Katalon Case
* Katalon #3: Support Predeployment Environment Checking on CBS Error
* Katalon #4: Generate Synology and Synology OBM Object Repository
* Katalon #5: Create Synology OBM File Sanity Workflow


### Minor features:
* Issue #329: [API] Mark "Expected Failed" for cases in API collection with TMS reported previously
* Sikulix #1: Skip the "Expected Failed" cases on the API consolidated failed HTML report.
* Katalon #1: Support Synology and Synology OBM Login 
* Katalon #2: Support Synology OBM Free Trial Registration
* Katalon #3: Support Synology OBM Installation / Uninstallation
* Katalon #4: Support Synology OBM Backup Set Creation and Checking
* Katalon #5: Support Synology OBM Backup / Restore / Utilities
* Katalon #6: Support Synology OBM Setting / Profile / Report Page

### Major Bug fixes:
* Issue #328: [MSSQL] Encode restore path for raw files restore due to behaviour change

----

## Version 4.3.0 (28 June 2018)

### Compatible Software:
* Ahsay 7.15.6.38
* CBK 3.3.2.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.107.3
* Newman 3.9.2
* ChromeDriver 2.39
* Selenese CBK Java 3.10.0

### Major features:
* Issue #291: [Upgrade] Large size v6 backup set migrate to v7
* Issue #294: [Jenkins] Improve the troubleshooting process for failed OBC Sanity Automation Execution cases
* Issue #227: [Upgrade] Add v6 LocalCopy in Automation Workflow
* Issue #323: [Office 365] Automate the backup of large number of mailboxes (e.g. 1000)
* Issue #324: [Office 365] Automate the backup of large number of mails in mailbox (e.g. 300k - 1m)
* Issue #195: [Office 365] Support backup/restore "Contacts" data
* Issue #327: [Office 365] Support backup/restore "Category" data
* Issue #302: [Office 365] Support backup/restore "Event" data
* Issue #165: [CDP] Support CDP for non-file backup set (Periodically backup)
* Issue #163: [General] Support backup/restore on OBC for backup set created in CBS
* Issue #86: [Encryption] Support the Encryption prompt page on OBC for backup sets NOT yet setup encryption settings
* API #1: Quota Management v1 / v2 Design
* API #2: Destination Checking of Sub Admin using UpdatePolicyGroup v1 / v2 API 

----

## Version 4.2.0 (31 May 2018)

### Compatible Software:
* Ahsay 7.15.6.20
* CBK 3.3.2.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.89.4
* Newman 3.9.2
* ChromeDriver 2.36
* Selenese CBK Java 3.10.0

### Major features:
* Issue #160: [VMware] Support Run Direct restore for VMware backup set
* Issue #287: [VMware] Support Data Comparison in VMware ESXi Workflow
* Issue #289: [VMware] Support other RunDirect restore options
* Issue #311: [RDR] Support v6 OBC AUA to v7 OBC via RDR
* Issue #312: [RDR] Support v7 OBC AUA to v7 OBC (Latest) via RDR
* Issue #313: [RDR] Support v7 OBC (Latest) AUA to v7 OBC (Fake version) via RDR
* Issue #292: [Office 365] Support Room Mailbox, Equipment Mailbox, and Shared Mailbox
* Issue #310: [Office 365] Develop the Data Comparison method for restored Data
* Issue #269: [File Backup Set] Build delta chain cases from v6 (Full and delta jobs in v6, delta jobs in v7)
* Issue #293: [Jenkins] Prepare 1 set of Sanity Test Execution workflows (12 hours) for JAR builds

### Minor features:
* Issue #308: [API] Support export final environment variables file before completing a run in Newman
* Issue #295: [API] Set API Schema as Environment Variable
* Issue #290: [VMware] Support call case by VMname(VM OS)
* Issue #297: [VMware] Support to run VMware Sanity with multiple destinations (CBS and Local)
* Issue #296: [Jenkins] Prepare Simplified Test Execution workflow for OBC installation and One Basic Case

### Major Bug fixes:
* Issue #315: [General] Fix Scroll Bar and Wait Time due to a longer list of Office 365 Backup Source

----

## Version 4.1.0 (19 April 2018)

### Compatible Software:
* Ahsay 7.15.4.10
* CBK 3.3.2.1

### Built With:
* Sikulix 1.0.1
* Jenkins 2.89.4
* Newman 3.9.2
* ChromeDriver 2.36
* Selenese CBK Java 3.10.0

### Major features:
* Issue #118: [Exchange] Support Exchange 2016 Server backup set
* Issue #119: [Exchange] Support Exchange 2016 Mail-level backup set
* Issue #256: [MSSQL] Support backup of Multiple instances
* Issue #280: [VMware] Support VMware Backup Set in CBK
* Issue #288: [API] Consolidate title of failed API case in one HTML file
* Issue #286: [Jenkins] Enhance the Presentation of Rerun execution cases in Jenkins
* Issue #284: [Jenkins] Consolidate execution results and centralize in Jenkins web console
* Issue #283: [Jenkins] Check for end of execution before generate result.html
* Issue #281: [Jenkins] Consolidate RDP Connection On Master
* Issue #59: [General] Check properties file with previous installed version and provide a comparison report


### Minor features:
* Issue #273: [Selenium] Integrate Selenium Web Driver Case to Sikuli
* Issue #268: [Log] Copy AUA related log to log folder when case fails

### Major Bug fixes:
* Issue #274: [Exchange] Fix Restore File Comparison Failure in Exchange cases
* Issue #124: [General] Fix the dark screen execution issue on Linux vm24

----

## Version 4.0.0 (Beta) (29 March 2018)

### Compatible Software:
* Ahsay 7.15.4.8
* CBK 3.3.0.1

### Built With:
* Sikulix 1.0.1
* Newman 3.9.2
* ChromeDriver 2.36
* Selenese CBK Java 3.10.0

### Major features:
* Issue #209: [General] Make Automation Execution able to start with 1-click

### Minor features:
* Issue #276: [API] Update the API consolidate report by counting the total failure in iterations, requests, test-scripts & Prerequest Scripts

### Major Bug fixes:
* Issue #270: [Cloud] Support "Please select a region" png added in OpenStack destination with Non SSL
* Issue #279: [VMware] Fine Tune the Restore Source Selection Method of VMware Backup Set

----

## Version 3.9.0 (23 March 2018)

### Compatible Software:
* Ahsay 7.15.4.1
* CBK 3.3.0.1

### Built With:
* Sikulix 1.0.1
* Newman 3.9.2
* ChromeDriver 2.36
* Selenese CBK Java 3.10.0

### Major features:
* Issue #237: [API] Setup a workflow for OBC running backup sets created by API
* Issue #265: [API] Develop "AddUser.do" collection in Data Driven approach
* Issue #266: [API] Develop "UpdateBackupSet.do" Standard API collection
* Issue #156: [VMware] Support VMware ESXi backup set Case
* Issue #157: [VMware] Support VMware vCenter backup set Case
* Issue #243: [VMware] Automate Generation of VMware snapshots in nested VM
* Issue #244: [VMware] Creation Workflow for VMware Backup Set
* Issue #245: [VMware] Backup Function for VMware backup set
* Issue #246: [VMware] Normal Restore Function for VMware Backup Set
* Issue #262: [Branding] Add a workflow to import Branding files in previous version CBS, upgrade to latest version and check if the branding 

### Minor features:
* Issue #264: [Selenium] Fix Issue and Enhance Report Naming of Selenium Web Driver Case 
* Issue #249: [API] Update the API HTML report by showing assertions above Response Body

### Major Bug fixes:
* Issue #257: [Newman] Keep Newman version in every VM steady at 3.9.2
* Issue #259: [Cloud] vm146 GoogleDrive Native App sometimes not sync when restoring files
* Issue #263: [Hyper-V] Fix Run Direct Restore multiple vms usually hit memory not enough issue
* Issue #271: [Hyper-V] Delete Backup Snapshot in Running Real VMs cause Restore Error
* Issue #272: [Hyper-V] Fix Granular Restore Issue of non run direct destination

----

## Version 3.8.1 (23 February 2018)

### Compatible Software:
* Ahsay 7.15.2.2
* CBK 3.3.0.1

### Major features:
* Issue #169: [MSSQL] Support MSSQL VSS Raw file restore
* Issue #253: [File Backup Set] Expand Delta backup flow to have 30+ delta backup
* Issue #215: [Powershell] Build a class to call Powershell scripts directly from Sikuli without involving ".bat" scripts in the middleion able to execute with OBC hotfixes

### Minor features:
* Issue #252: [Branding] Expand Branding data coverage

----

## Version 3.8.0 (15 February 2018)

### Compatible Software:
* Ahsay 7.15.2.2
* CBK 3.3.0.1

### Major features:
* Issue #144: [Run on Server] Backup flow for Run on server backup set
* Issue #145: [Run on Server] Restore flow for Run on server backup set
* Issue #212: [Branding] Support build CBS installer
* Issue #238: [Branding] Support Building installers with Digital Signature ENABLED
* Issue #247: [General] Make Automation able to execute with CBS hotfixes
* Issue #248: [General] Make Automation able to execute with OBC hotfixes

### Minor features:
* Issue #234: [General] Upgrade depreciated Google Drive app to Backup & Sync
* Issue #236: [Branding] Enforce Building installers from Internal ACP
* Issue #201: [Backward Compatibility] Add a workflow for v6 OBC connecting v7 CBS, and the backup user never upgrade to v7
* Issue #216: [Upgrade] Test AUA upgrade to fake version from FRESH INSTALLED latest version OBC
* Issue #196: [Upgrade] Handle CBS V7 Upgrade Flow in Linux (v7.3 > v7.7 > ... > v7.X Latest)
* Issue #150: [OBC] Support AUA To Fake Version for Linux OBC
* Issue #235: [Git] Avoid blocking the git process by non-sync "Executions" Folder
* Issue #206: [API] Enhance Newman function to handle even API assertion failed would NOT caused the whole case failed
* Issue #224: [Selenium] Check main menu world after each workflow
* Issue #168: [MSSQL] Split MSSQLSanity into 2 cases
* Issue #117: [Exchange] .bat/.ps1 utility scripts used in Exchange automation should be portable
* Issue #132: [Exchange] Check if Exchange Services Started before execution
* Issue #205: [Office 365] Update the Office 365 Large Data flow expected behaviour
* Issue #198: [Office 365] Update Office365 Quota for user of case Office365LARGEData


### Major Bug fixes:
  * Issue #131: [Exchange] Hit insufficient disk usage easily in vm115
  * Issue #207: [RDR] Config Sub-Admin host settings in CBS and RDR for #188

----

## Version 3.7.0 (15 January 2018)

### Compatible Software:
* Ahsay 7.15.0.20
* CBK 3.3.0.1

### Major features:
* Issue #143: [Hyper-V] Support Granular Restore for Hyper-V backup set
* Issue #172: [Installation] Support Installation of OBS v6 (On Windows)
* Issue #158: [Backward Compatibility] New backup set wizard in v6 OBC connecting v7 CBS (OBC on Linux)
* Issue #159: [Backward Compatibility] Backup function in v6 OBC connecting v7 CBS (OBC on Linux)
* Issue #147: [Backward Compatibility] Restore function in v6 OBC connecting v7 CBS
* Issue #187: [Backward Compatibility] Handle the FileExplorer in v6 OBC
* Issue #189: [Backward Compatibility] Support LocalCopy backup in v6 OBC
* Issue #174: [Upgrade] Indirect Upgrade Path in Windows(v6.29 > v7.7 > v7.X Latest)
* Issue #175: [Upgrade] Indirect Upgrade Path in Windows(v6.29 > v7.5 > v7.X Latest)
* Issue #171: [Upgrade] Indirect Upgrade Path in Windows(v6.29 > v7.13 > v7.X Latest)
* Issue #184: [Upgrade] Handle CBS V7 Upgrade Flow in Windows (v7.3 > v7.5 > ... > v7.X Latest)
* Issue #170: [Upgrade] Handle OBC V7 Upgrade Flow (v7.3 > v7.5>... v7.15)
* Issue #191: [Office 365] Automate create & remove users and generate 10000 mail items in Office 365 mailbox
* Issue #197: [Office 365] Support Large Data Backup (15 mailbox accounts with 10000 mail items)
* Issue #188: [RDR] Support Sub-Admin owned backup user login via RDR

### Minor features:
* Issue #190: [Office 365] Support selecting multiple backup sources for Office 365 Mail-level backup set
* Issue #176: [OpenDirect] Set OpenDirect page to be configurable in order to support backup sets created in pre-7.13
* Issue #185: [API] Run Newman in Linux OS
* Issue #178: [API] Develop Standard API requests for v6 OBS
* Issue #182: [API] Call AddUser/UpdateUser/RemoveUser/UpdateLicense JSON API requests in Newman for v7 CBS
* Issue #179: [Installation] Uninstall CBS function should work for both CBS v6 and CBS v7
* Issue #181: [Installation] Prepare license.xml files for v6 OBS installed on different machines
* Issue #177: [Installation] Open a new class for installation of different version CBS /OBC
* Issue #173: [Upgrade] Add a Migration Class to handle the api verification and utilities flow
* Issue #186: [Upgrade] Upgrade CBS version in Windows
* Issue #192: [Selenium] Develop Selenium Class to work with updated Seleness CBK
* Issue #193: [General] Rename Sikuli file naming to prevent name crash in "OS" and "Settings"

----

## Version 3.6.0 (19 December 2017)

### Compatible Software:
* Ahsay 7.15.0.20
* CBK 3.3.0.1

### Major features:
* Issue #85: [MSSQL] Support MSSQL VSS Backup Set
* Issue #167: [MSSQL] Support MSSQL ODBC Backup Set
* Issue #140: [Backward Compatibility] New backup set wizard in v6 OBC connecting v7 CBS (OBC on Windows)
* Issue #146: [Backward Compatibility] Backup function in v6 OBC connecting v7 CBS (OBC on Windows)
* Issue #148: [Upgrade] Upgrade v6 OBC connecting v7 CBS to v7 OBC
* Issue #100: [RDR] Support RDR in Automation
* Issue #101: [RPS] Support RPS in Automation
* Issue #107: [Offline Installer] Support Windows OBC Offline installer
* Issue #141: [Offline Installer] Support Linux OBM Offline installer

### Minor features:
* Issue #125: [Branding] Integrate Branding automation in Selenium with Christopher Robin
* Issue #142: [RDR] Free Trial Registration in RDR
* Issue #149: [OBC] Support AUA To Fake Version for Windows OBC
* Issue #166: [Newman] Support Global Variables and Request Retry
* Issue #108: [General] Execution should run against "Execution", "Cases" and "Screenshot" folders in execution machine's local drive

### Major Bug fixes:
* Issue #151: [Utilities] Unable to select specific destination to delete ALL backup data

----

## Version 3.5.0 (29 November 2017)

### Compatible Software:
* Ahsay 7.15.0.20
* CBK 3.3.0.1

### Major features:
* Issue #111: [Hyper-V] Support Hyper-V Backup Set
* Issue #113: [Cloud] Enrich the backup data to Cloud destinations
* Issue #120: [Office 365] Support backup/restore or Public Folder
* Issue #122: [Office 365] Develop REST API to create test data/validate restoration in Office 365
* Issue #123: [Installation] After installed CBS/OBC/ACB, check the Linux services
* Issue #126: [Backward Compatibility] Support v6 OBC connecting v7 CBS (OBC on Windows)
* Issue #138: [Backward Compatibility] Support v6 OBM connecting v7 CBS (OBM on Linux)
* Issue #60: [OBC] Support AUA for Windows OBC (From v6)
* Issue #139: [OBC] Support AUA for Linux OBM (From v6)
* Issue #129: [API] Upgrade Newman in vm146 and vm170 to v3.8.3 to improve the performance
* Issue #134: [API] Create a new class to handle Newman integration


### Major Bug fixes:
* Issue #116: [Office365] Office 365 Backup Source Changed
* Issue #128: [Cloud] Fail to identify OneDrive Auth Page in vm146
* Issue #130: [Cloud] Update OneDrive Password in vm146 app

----

## Version 3.4.0 (10 October 2017)

### Compatible Software:
* Ahsay 7.14.4.0
* CBK 3.1.0.1

### Major features:
* Issue #112: [Email] Support SMTP and Contacts configurations in Sanity Environment
* Issue #114: [Installation] Increase the max heap size of cbs

### Major Bug fixes:
* Issue #110: [Reporting] Remove counting of API related cases on the total number of automation cases
* Issue #115: [Installation] Update the OBC installer name

----

## Version 3.3.0 (5 September 2017)

### Compatible Software:
* Ahsay 7.14.1.0
* CBK 3.1.0.1

### Major features:
* Issue #19: [Exchange Mail] Support Exchange Mail Backup Set
* Issue #20: [Exchange Server] Support Exchange Server Backup Set
* Issue #68: [Cloud] Support backup to Predefined destinations
* Issue #102: [Upgrade] Test AUA upgrade for Windows ACB (From previous v7)
* Issue #103: [Upgrade] Test AUA upgrade for Linux OBM (From previous v7)
* Issue #99: [Reporting] Log the difference of FileSanity case executed
* Issue #75: [OBC] Check OBC Main Menu elements

### Major Bug fixes:
* Issue #109: [General] Execution on Linux VM 24 failed with Sikuli keep clicking on bottom menu bar

----

# Release notes for UI Automation #

## Initial Design ##
October 19, 2016 Update

## Product Description ##
This product is used for running regression test on OBC/CBK related functions.

## Program Language ##
* Jython / Python
* Java
* Batch Script & Shell Script
* Supported Platforms:
* Windows
* Linux
* Mac (only for installation process)

## Configuration Notes ##
Execution scripts (e.g. .bat/.sh) needed to copied to the relevant vm for running automation cases. Execution name need to be defined correctly in the scripts

## Coding Structure ##
* Workflow Library (Includes the general methods shared by different modules)
* Cases (A complete test case that used to verify the objective)
* Execution Scripts (Used for log folder creation and calling the executions in sikuli to run)
* Executions (A test suite that consists of numbers of cases to run)
* Screenshot library (Screenshot)

## Limitations ##
* For Cloud File and Office 365 Backup Set, currently no result comparison logic is applied after restoring the file 
* Trial Account of Amazon Cloud Drive has been ended. Need to wait a new account for developing Cloud File Backup Set of source Amazon Cloud Drive
* For Retention Policy, only simple option and jobs are tested.
* Cases need to be re-run manually if it failed

## Performance Issues ##
* May stop unexpectedly if running in vSphere Center for Windows vm

----