/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqRptSel.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQRPTSEL_HXX_
#define _INQRPTSEL_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define EXT_INQ_RPT_SEL_REC_MAX	29

/******************************************************************************/

#ifndef _BSC_INQ_RPT_SEL_POSN_REQUEST_T_
#define _BSC_INQ_RPT_SEL_POSN_REQUEST_T_

typedef struct bscInqRptSelPosnRequestTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} bscInqRptSelPosnRequestT, *pBscInqRptSelPosnRequestT;


#endif  /* _BSC_INQ_RPT_SEL_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_RPT_SEL_REQUEST_T_
#define _INQ_RPT_SEL_REQUEST_T_

typedef struct inqRptSelRequestTag
{
  dataHeaderT header;
  bscInqRptSelPosnRequestT basic;
} inqRptSelRequestT, *pInqRptSelRequestT;


#endif  /* _INQ_RPT_SEL_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_RPT_SEL_RESPONSE_T_
#define _BSC_INQ_RPT_SEL_RESPONSE_T_

typedef struct bscInqRptSelResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
} bscInqRptSelResponseT, *pBscInqRptSelResponseT;


#endif  /* _BSC_INQ_RPT_SEL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_RPT_SEL_REC_T_
#define _EXT_INQ_RPT_SEL_REC_T_

typedef struct extInqRptSelRecTag
{
  char rptIdCod[DRIV_RPT_ID_COD_LEN];
  char prodId[PROD_ID_LEN];
  char freqTypCod;
  char rptNam[DRIV_RPT_NAM_LEN];
  char locCod;
  char stdRptReqInd;
  char rawRptReqInd;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} extInqRptSelRecT, *pExtInqRptSelRecT;


#endif  /* _EXT_INQ_RPT_SEL_REC_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_RPT_SEL_RESPONSE_T_
#define _EXT_INQ_RPT_SEL_RESPONSE_T_

typedef struct extInqRptSelResponseTag
{
  extInqRptSelRecT extInqRptSelRec[EXT_INQ_RPT_SEL_REC_MAX];
} extInqRptSelResponseT, *pExtInqRptSelResponseT;


#endif  /* _EXT_INQ_RPT_SEL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_RPT_SEL_RESPONSE_T_
#define _INQ_RPT_SEL_RESPONSE_T_

typedef struct inqRptSelResponseTag
{
  dataHeaderT header;
  bscInqRptSelResponseT basic;
  extInqRptSelResponseT extension;
} inqRptSelResponseT, *pInqRptSelResponseT;


#endif  /* _INQ_RPT_SEL_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQRPTSEL_HXX_ */

/******************************************************************************/
/* End of file InqRptSel.hxx */
/******************************************************************************/