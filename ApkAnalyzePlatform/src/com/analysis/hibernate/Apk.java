package com.analysis.hibernate;

/**
 * Apk entity. @author MyEclipse Persistence Tools
 */

public class Apk implements java.io.Serializable {

	// Fields

	private Integer idApk;
	private String apkName;
	private String apkType;
	private Integer developerId;
	private String versionName;
	private Boolean readPhoneState;
	private Boolean accessNetworkState;
	private Boolean changeNetworkStatel;
	private Boolean accessWifiState;
	private Boolean changeWifiState;
	private Boolean readExternalStorage;
	private Boolean writeExternalStorage;
	private Boolean viberate;
	private Boolean mountUnmountFilesystem;
	private Boolean accessFineLocation;
	private Boolean accessCoarseLocation;
	private Boolean bluetooth;
	private Boolean readCalendar;
	private Boolean writeCalendar;
	private Boolean carmer;
	private Boolean recordAudio;
	private Boolean modifyAudioSetting;
	private Boolean wakeLock;
	private Boolean systemAlertWindow;
	private Boolean getAccounts;
	private Boolean manageAccount;
	private Boolean writtingSettings;
	private Boolean receiverUserPresent;

	// Constructors

	/** default constructor */
	public Apk() {
	}

	/** minimal constructor */
	public Apk(String apkName, String apkType) {
		this.apkName = apkName;
		this.apkType = apkType;
	}

	/** full constructor */
	public Apk(String apkName, String apkType, Integer developerId, String versionName, Boolean readPhoneState,
			Boolean accessNetworkState, Boolean changeNetworkStatel, Boolean accessWifiState, Boolean changeWifiState,
			Boolean readExternalStorage, Boolean writeExternalStorage, Boolean viberate, Boolean mountUnmountFilesystem,
			Boolean accessFineLocation, Boolean accessCoarseLocation, Boolean bluetooth, Boolean readCalendar,
			Boolean writeCalendar, Boolean carmer, Boolean recordAudio, Boolean modifyAudioSetting, Boolean wakeLock,
			Boolean systemAlertWindow, Boolean getAccounts, Boolean manageAccount, Boolean writtingSettings,
			Boolean receiverUserPresent) {
		this.apkName = apkName;
		this.apkType = apkType;
		this.developerId = developerId;
		this.versionName = versionName;
		this.readPhoneState = readPhoneState;
		this.accessNetworkState = accessNetworkState;
		this.changeNetworkStatel = changeNetworkStatel;
		this.accessWifiState = accessWifiState;
		this.changeWifiState = changeWifiState;
		this.readExternalStorage = readExternalStorage;
		this.writeExternalStorage = writeExternalStorage;
		this.viberate = viberate;
		this.mountUnmountFilesystem = mountUnmountFilesystem;
		this.accessFineLocation = accessFineLocation;
		this.accessCoarseLocation = accessCoarseLocation;
		this.bluetooth = bluetooth;
		this.readCalendar = readCalendar;
		this.writeCalendar = writeCalendar;
		this.carmer = carmer;
		this.recordAudio = recordAudio;
		this.modifyAudioSetting = modifyAudioSetting;
		this.wakeLock = wakeLock;
		this.systemAlertWindow = systemAlertWindow;
		this.getAccounts = getAccounts;
		this.manageAccount = manageAccount;
		this.writtingSettings = writtingSettings;
		this.receiverUserPresent = receiverUserPresent;
	}

	// Property accessors

	public Integer getIdApk() {
		return this.idApk;
	}

	public void setIdApk(Integer idApk) {
		this.idApk = idApk;
	}

	public String getApkName() {
		return this.apkName;
	}

	public void setApkName(String apkName) {
		this.apkName = apkName;
	}

	public String getApkType() {
		return this.apkType;
	}

	public void setApkType(String apkType) {
		this.apkType = apkType;
	}

	public Integer getDeveloperId() {
		return this.developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Boolean getReadPhoneState() {
		return this.readPhoneState;
	}

	public void setReadPhoneState(Boolean readPhoneState) {
		this.readPhoneState = readPhoneState;
	}

	public Boolean getAccessNetworkState() {
		return this.accessNetworkState;
	}

	public void setAccessNetworkState(Boolean accessNetworkState) {
		this.accessNetworkState = accessNetworkState;
	}

	public Boolean getChangeNetworkStatel() {
		return this.changeNetworkStatel;
	}

	public void setChangeNetworkStatel(Boolean changeNetworkStatel) {
		this.changeNetworkStatel = changeNetworkStatel;
	}

	public Boolean getAccessWifiState() {
		return this.accessWifiState;
	}

	public void setAccessWifiState(Boolean accessWifiState) {
		this.accessWifiState = accessWifiState;
	}

	public Boolean getChangeWifiState() {
		return this.changeWifiState;
	}

	public void setChangeWifiState(Boolean changeWifiState) {
		this.changeWifiState = changeWifiState;
	}

	public Boolean getReadExternalStorage() {
		return this.readExternalStorage;
	}

	public void setReadExternalStorage(Boolean readExternalStorage) {
		this.readExternalStorage = readExternalStorage;
	}

	public Boolean getWriteExternalStorage() {
		return this.writeExternalStorage;
	}

	public void setWriteExternalStorage(Boolean writeExternalStorage) {
		this.writeExternalStorage = writeExternalStorage;
	}

	public Boolean getViberate() {
		return this.viberate;
	}

	public void setViberate(Boolean viberate) {
		this.viberate = viberate;
	}

	public Boolean getMountUnmountFilesystem() {
		return this.mountUnmountFilesystem;
	}

	public void setMountUnmountFilesystem(Boolean mountUnmountFilesystem) {
		this.mountUnmountFilesystem = mountUnmountFilesystem;
	}

	public Boolean getAccessFineLocation() {
		return this.accessFineLocation;
	}

	public void setAccessFineLocation(Boolean accessFineLocation) {
		this.accessFineLocation = accessFineLocation;
	}

	public Boolean getAccessCoarseLocation() {
		return this.accessCoarseLocation;
	}

	public void setAccessCoarseLocation(Boolean accessCoarseLocation) {
		this.accessCoarseLocation = accessCoarseLocation;
	}

	public Boolean getBluetooth() {
		return this.bluetooth;
	}

	public void setBluetooth(Boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public Boolean getReadCalendar() {
		return this.readCalendar;
	}

	public void setReadCalendar(Boolean readCalendar) {
		this.readCalendar = readCalendar;
	}

	public Boolean getWriteCalendar() {
		return this.writeCalendar;
	}

	public void setWriteCalendar(Boolean writeCalendar) {
		this.writeCalendar = writeCalendar;
	}

	public Boolean getCarmer() {
		return this.carmer;
	}

	public void setCarmer(Boolean carmer) {
		this.carmer = carmer;
	}

	public Boolean getRecordAudio() {
		return this.recordAudio;
	}

	public void setRecordAudio(Boolean recordAudio) {
		this.recordAudio = recordAudio;
	}

	public Boolean getModifyAudioSetting() {
		return this.modifyAudioSetting;
	}

	public void setModifyAudioSetting(Boolean modifyAudioSetting) {
		this.modifyAudioSetting = modifyAudioSetting;
	}

	public Boolean getWakeLock() {
		return this.wakeLock;
	}

	public void setWakeLock(Boolean wakeLock) {
		this.wakeLock = wakeLock;
	}

	public Boolean getSystemAlertWindow() {
		return this.systemAlertWindow;
	}

	public void setSystemAlertWindow(Boolean systemAlertWindow) {
		this.systemAlertWindow = systemAlertWindow;
	}

	public Boolean getGetAccounts() {
		return this.getAccounts;
	}

	public void setGetAccounts(Boolean getAccounts) {
		this.getAccounts = getAccounts;
	}

	public Boolean getManageAccount() {
		return this.manageAccount;
	}

	public void setManageAccount(Boolean manageAccount) {
		this.manageAccount = manageAccount;
	}

	public Boolean getWrittingSettings() {
		return this.writtingSettings;
	}

	public void setWrittingSettings(Boolean writtingSettings) {
		this.writtingSettings = writtingSettings;
	}

	public Boolean getReceiverUserPresent() {
		return this.receiverUserPresent;
	}

	public void setReceiverUserPresent(Boolean receiverUserPresent) {
		this.receiverUserPresent = receiverUserPresent;
	}

}