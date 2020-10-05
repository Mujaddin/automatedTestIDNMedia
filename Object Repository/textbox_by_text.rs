<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>textbox_by_text</name>
   <tag></tag>
   <elementGuidId>c209414d-755c-44fc-a096-0268481aa616</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[contains(@class,'active')]//label[(text() = '${text}' or . = '${text}')]/parent::div//input</value>
      </entry>
      <entry>
         <key>BASIC</key>
         <value>//input[(text() = '${text}' or . = '${text}')]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>input</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${text}</value>
   </webElementProperties>
</WebElementEntity>
