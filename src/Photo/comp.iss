; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Pharmacy"
#define MyAppVersion "1.5"
#define MyAppPublisher "loul youssef"
#define MyAppExeName "Pharmacy.jar"
#define MyAppAssocName MyAppName + " File"
#define MyAppAssocExt ".exe"
#define MyAppAssocKey StringChange(MyAppAssocName, " ", "") + MyAppAssocExt

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{9161E203-00FC-4EA5-B4E3-A68C740BFE4C}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={autopf}\{#MyAppName}
ChangesAssociations=yes
DisableProgramGroupPage=yes
; Remove the following line to run in administrative install mode (install for all users.)
PrivilegesRequired=lowest
PrivilegesRequiredOverridesAllowed=commandline
OutputDir=C:\Users\admin\OneDrive\Bureau
OutputBaseFilename=mysetup
SetupIconFile=C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\src\Photo\blob.jpg
Compression=lzma
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "french"; MessagesFile: "compiler:Languages\French.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\{#MyAppExeName}"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\AbsoluteLayout.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\commons-dbutils-1.3-sources.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\jar_files-1.zip"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\jcalendar-1.4.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\mysql-connector-j-8.3.0.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\dist\lib\rs2xml.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\admin\OneDrive\Documents\NetBeansProjects\Pharmacy\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Registry]
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocExt}\OpenWithProgids"; ValueType: string; ValueName: "{#MyAppAssocKey}"; ValueData: ""; Flags: uninsdeletevalue
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}"; ValueType: string; ValueName: ""; ValueData: "{#MyAppAssocName}"; Flags: uninsdeletekey
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}\DefaultIcon"; ValueType: string; ValueName: ""; ValueData: "{app}\{#MyAppExeName},0"
Root: HKA; Subkey: "Software\Classes\{#MyAppAssocKey}\shell\open\command"; ValueType: string; ValueName: ""; ValueData: """{app}\{#MyAppExeName}"" ""%1"""
Root: HKA; Subkey: "Software\Classes\Applications\{#MyAppExeName}\SupportedTypes"; ValueType: string; ValueName: ".myp"; ValueData: ""

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: shellexec postinstall skipifsilent

