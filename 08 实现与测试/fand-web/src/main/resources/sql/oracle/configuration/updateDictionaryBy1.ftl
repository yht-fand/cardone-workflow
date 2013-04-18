UPDATE FD_DICTIONARY T
<#assign prefixName='SET'>
<#if (update__id??)>
	<#if (update__id__value??)>
${prefixName} T.ID_ = :update__id__value
	<#else>
${prefixName} T.ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__dictionaryTyId??)>
	<#if (update__dictionaryTyId__value??)>
${prefixName} T.DICTIONARY_TY_ID_ = :update__dictionaryTyId__value
	<#else>
${prefixName} T.DICTIONARY_TY_ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__order??)>
	<#if (update__order__value??)>
${prefixName} T.ORDER_ = :update__order__value
	<#else>
${prefixName} T.ORDER_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__endTi??)>
	<#if (update__endTi__value??)>
${prefixName} T.END_TI_ = :update__endTi__value
	<#else>
${prefixName} T.END_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__name??)>
	<#if (update__name__value??)>
${prefixName} T.NAME_ = :update__name__value
	<#else>
${prefixName} T.NAME_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__code??)>
	<#if (update__code__value??)>
${prefixName} T.CODE_ = :update__code__value
	<#else>
${prefixName} T.CODE_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (update__beginTi??)>
	<#if (update__beginTi__value??)>
${prefixName} T.BEGIN_TI_ = :update__beginTi__value
	<#else>
${prefixName} T.BEGIN_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#include "whereDictionaryBy1.ftl">